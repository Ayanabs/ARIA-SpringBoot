package org.accimt.aria.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import org.accimt.aria.authentication.ValidRole;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private LocalDateTime createdAt;

    @NotBlank(message = "Firstname is required")
    @Size(min = 3, max = 20, message = "Firstname must be between 3 and 20 characters")
    private String fname;

    @NotBlank(message = "Surname is required")
    @Size(min = 3, max = 20, message = "Surname must be between 3 and 20 characters")
    private String surname;

    @NotBlank(message = "Password is required")
    @Size(min = 4, message = "Password must be at least 4 characters long")
    private String password;

    @NotBlank(message = "Email is required")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotNull(message = "Salary is required")
    private BigDecimal salary;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits")
    private String phone;

    @NotBlank(message = "Role is required")
    @ValidRole
    private String role;


}
