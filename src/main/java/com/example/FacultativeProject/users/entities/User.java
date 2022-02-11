package com.example.FacultativeProject.users.entities;

import lombok.Data;
import lombok.ToString;
import lombok.extern.java.Log;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * User entity.
 *
 * @author V.Dulsky
 */

@Log
@Data
@ToString
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

    public User(ResultSet resultSet) throws SQLException {
        setId(resultSet.getInt("id"));
        setFirstname(resultSet.getString("firstname"));
        setLastname(resultSet.getString("lastname"));
        setLogin(resultSet.getString("login"));
        setPassword(resultSet.getString("password"));
        setDescription(resultSet.getString("description"));
        setRoles_id(resultSet.getInt("roles_id"));
    }
}
