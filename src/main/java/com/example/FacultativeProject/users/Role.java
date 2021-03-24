package com.example.FacultativeProject.users;


/**
 * Role entity
 *
 * @author V.Dulsky
 */

public enum Role {
    ADMIN, CLIENT, TEACHER;

    public static Role getRole(User user) {
        int roleId = user.getRoles_id();
        return Role.values()[roleId];
    }

    public String getName() {
        return name().toLowerCase();
    }
}
