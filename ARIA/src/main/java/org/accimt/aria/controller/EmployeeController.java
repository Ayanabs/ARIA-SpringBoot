package org.accimt.aria.controller;

import org.accimt.aria.dto.EmployeeDto;
import org.accimt.aria.dto.AuthResponse;
import org.accimt.aria.dto.LoginRequest;
import org.accimt.aria.service.EmployeeService;
import lombok.AllArgsConstructor;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    private static final String HARDCODED_EMPLOYEE_EMAIL = "employee@example.com";
    private static final String HARDCODED_EMPLOYEE_PASSWORD = "password123";

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication;

        if (HARDCODED_EMPLOYEE_EMAIL.equalsIgnoreCase(loginRequest.getEmail()) &&
                HARDCODED_EMPLOYEE_PASSWORD.equals(loginRequest.getPassword())) {

            authentication = new UsernamePasswordAuthenticationToken(
                    HARDCODED_EMPLOYEE_EMAIL,
                    null,
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_EMPLOYEE"))
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
                .orElse("ROLE_EMPLOYEE");

        AuthResponse authResponse = new AuthResponse();
        authResponse.setToken(token);
        authResponse.setAccessToken(token);
        authResponse.setEmail(loginRequest.getEmail());
        authResponse.setRole(role);

        return ResponseEntity.ok(authResponse);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }
}
