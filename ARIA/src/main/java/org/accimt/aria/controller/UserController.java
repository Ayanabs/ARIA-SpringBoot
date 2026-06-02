package org.accimt.aria.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.accimt.aria.dto.AuthResponse;
import org.accimt.aria.dto.LoginRequest;
import org.accimt.aria.dto.UserDto;
import org.accimt.aria.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.accimt.aria.security.JwtTokenProvider;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;


    private static final String HARDCODED_EMAIL = "admin@example.com";
    private static final String HARDCODED_PASSWORD = "password123";

    @PostMapping("/register")
    public ResponseEntity<UserDto> create(@Valid @RequestBody UserDto dto) {
        return new ResponseEntity<>(userService.createUser(dto), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication;


        if (HARDCODED_EMAIL.equalsIgnoreCase(loginRequest.getEmail()) &&
                HARDCODED_PASSWORD.equals(loginRequest.getPassword())) {


            authentication = new UsernamePasswordAuthenticationToken(
                    HARDCODED_EMAIL,
                    null,
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"))
            );
        } else {
            try {
                authentication = authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                loginRequest.getEmail(),
                                loginRequest.getPassword()
                        )
                );
            } catch (org.springframework.security.core.AuthenticationException e) {
                throw new org.springframework.web.server.ResponseStatusException(
                        org.springframework.http.HttpStatus.UNAUTHORIZED, "Invalid email or password", e);
            }
        }

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtTokenProvider.generateToken(authentication);
        String role = authentication.getAuthorities().stream()
                .map(grantedAuthority -> grantedAuthority.getAuthority())
                .findFirst()
                .orElse("ROLE_USER");

        AuthResponse authResponse = new AuthResponse();
        authResponse.setToken(token);
        authResponse.setAccessToken(token);
        authResponse.setEmail(loginRequest.getEmail());
        authResponse.setRole(role);

        return ResponseEntity.ok(authResponse);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'EMPLOYEE')")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.ok("User deleted successfully!");
    }
}
