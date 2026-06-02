package org.accimt.aria.security;

import org.accimt.aria.entity.User;
import org.accimt.aria.entity.UserRole;
import org.accimt.aria.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CustomUserDetailsServiceTest {

    private CustomUserDetailsService userDetailsService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userDetailsService = new CustomUserDetailsService(userRepository);
    }

    @Test
    void loadUserByUsername_HardcodedAdmin_ReturnsAdminDetails() {
        UserDetails userDetails = userDetailsService.loadUserByUsername("admin@example.com");

        assertNotNull(userDetails);
        assertEquals("admin@example.com", userDetails.getUsername());
        assertTrue(userDetails.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN")));
        verifyNoInteractions(userRepository);
    }

    @Test
    void loadUserByUsername_DbUser_ReturnsUserDetails() {
        User user = new User();
        user.setEmail("dbuser@example.com");
        user.setPassword("encodedPassword");
        user.setRole(UserRole.USER);

        when(userRepository.findByEmail("dbuser@example.com")).thenReturn(Optional.of(user));

        UserDetails userDetails = userDetailsService.loadUserByUsername("dbuser@example.com");

        assertNotNull(userDetails);
        assertEquals("dbuser@example.com", userDetails.getUsername());
        assertEquals("encodedPassword", userDetails.getPassword());
        assertTrue(userDetails.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_USER")));
        verify(userRepository, times(1)).findByEmail("dbuser@example.com");
    }

    @Test
    void loadUserByUsername_NonExistentUser_ThrowsException() {
        when(userRepository.findByEmail("notfound@example.com")).thenReturn(Optional.empty());

        assertThrows(UsernameNotFoundException.class, () -> {
            userDetailsService.loadUserByUsername("notfound@example.com");
        });
        verify(userRepository, times(1)).findByEmail("notfound@example.com");
    }
}
