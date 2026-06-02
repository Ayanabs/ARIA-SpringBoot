package org.accimt.aria.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    private String email;
    private String username;
    private String usernameOrEmail;

    @NotBlank(message = "Email or Username is required")
    public String getEmail() {
        if (email != null && !email.isBlank()) {
            return email;
        }
        if (username != null && !username.isBlank()) {
            return username;
        }
        if (usernameOrEmail != null && !usernameOrEmail.isBlank()) {
            return usernameOrEmail;
        }
        return null;
    }

    public String getUsername() {
        return getEmail();
    }

    public String getUsernameOrEmail() {
        return getEmail();
    }

    @NotBlank(message = "Password is required")
    @Getter
    private String password;
}

