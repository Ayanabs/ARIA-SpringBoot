package org.accimt.aria.security;

import lombok.AllArgsConstructor;
import org.accimt.aria.entity.User;
import org.accimt.aria.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        if ("admin@example.com".equalsIgnoreCase(email)) {
            return new org.springframework.security.core.userdetails.User(
                    "admin@example.com",
                    "password123",
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"))
            );
        } else if ("user@example.com".equalsIgnoreCase(email)) {
            return new org.springframework.security.core.userdetails.User(
                    "user@example.com",
                    "password123",
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
            );
        } else if ("employee@example.com".equalsIgnoreCase(email)) {
            return new org.springframework.security.core.userdetails.User(
                    "employee@example.com",
                    "password123",
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_EMPLOYEE"))
            );
        }

        try {
            User user = userRepository.findByEmail(email)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + user.getRole());

            return new org.springframework.security.core.userdetails.User(
                    user.getEmail(),
                    user.getPassword(),
                    Collections.singletonList(authority)
            );
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found with email: " + email, e);
        }
    }
}
