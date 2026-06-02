package org.accimt.aria.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserRole {
    public static final String ADMIN = "ADMIN";
    public static final String USER = "USER";

    // Centralized place to define all active/allowed roles in the application.
    // Easy to extend later when connecting to external providers like Keycloak.
    public static final List<String> ALL_ROLES = Collections.unmodifiableList(
            Arrays.asList(ADMIN, USER)
    );

    public static boolean isValidRole(String role) {
        if (role == null) {
            return false;
        }
        return ALL_ROLES.contains(role.toUpperCase().trim());
    }
}