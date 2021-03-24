package com.example.FacultativeProject.users;

import java.io.Serializable;

/**
 * User entity.
 *
 * @author V.Dulsky
 */
public class User implements Serializable {

    private int id;
    private String firstname;
    private String lastname;
    private String login;
    private String password;
    private String description;
    private int roles_id;


    public User() {

    }

    public User(int id, String firstname, String lastname, String login, String password, String description, int roles_id) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.description = description;
        this.roles_id = roles_id;
    }

    public User(String firstname, String lastname, String login, String password, String description, int roles_id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.description = description;
        this.roles_id = roles_id;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(int roles_id) {
        this.roles_id = roles_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", description='" + description + '\'' +
                ", roles_id=" + roles_id +
                '}';
    }
}
