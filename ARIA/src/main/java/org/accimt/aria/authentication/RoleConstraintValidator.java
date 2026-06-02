package org.accimt.aria.authentication;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.accimt.aria.entity.UserRole;

public class RoleConstraintValidator implements ConstraintValidator<ValidRole, String> {

    @Override
    public boolean isValid(String inputRole, ConstraintValidatorContext context) {
        return UserRole.isValidRole(inputRole);
    }
}
