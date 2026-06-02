package org.accimt.aria.authentication;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = RoleConstraintValidator.class)
public @interface ValidRole {
    String message() default "Invalid role. Must be a registered system role (e.g. ADMIN, USER)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
