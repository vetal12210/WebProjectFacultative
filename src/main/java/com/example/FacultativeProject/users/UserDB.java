package com.example.FacultativeProject.users;

import java.sql.*;
import java.util.ArrayList;

/**
 * UserDB
 *
 * @author V.Dulsky
 */
public class UserDB {

    private static final String url = "jdbc:postgresql://localhost:5432/facultativeMyProj";
    private static final String username = "postgres";
    private static final String password = "aaaaa55555";


    public static ArrayList<User> select() {

        ArrayList<User> users = new ArrayList<User>();
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users ORDER BY firstname");
                while (resultSet.next()) {

                    int id = resultSet.getInt(1);
                    String firstname = resultSet.getString(2);
                    String lastname = resultSet.getString(3);
                    String login = resultSet.getString(4);
                    String password = resultSet.getString(5);
                    String description = resultSet.getString(6);
                    int roles_id = resultSet.getInt(7);
                    User user = new User(id, firstname, lastname, login, password, description, roles_id);
                    users.add(user);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return users;
    }


    public static User selectOne(String login) {

        User user = null;
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "SELECT * FROM users WHERE login=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, login);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {

                        int iD = resultSet.getInt(1);
                        String firstname = resultSet.getString(2);
                        String lastname = resultSet.getString(3);
                        String login1 = resultSet.getString(4);
                        String password = resultSet.getString(5);
                        String description = resultSet.getString(6);
                        int roles_id = resultSet.getInt(7);
                        user = new User(iD, firstname, lastname, login1, password, description, roles_id);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return user;
    }

    public static User selectById(int id) {

        User user = null;
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "SELECT * FROM users WHERE id=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {

                        int iD = resultSet.getInt(1);
                        String firstname = resultSet.getString(2);
                        String lastname = resultSet.getString(3);
                        String login = resultSet.getString(4);
                        String password = resultSet.getString(5);
                        String description = resultSet.getString(6);
                        int roles_id = resultSet.getInt(7);
                        user = new User(iD, firstname, lastname, login, password, description, roles_id);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return user;
    }

    public static int insert(User user) {

        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "INSERT INTO users (firstname, lastname, login, password, description, roles_id) Values (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, user.getFirstname());
                    preparedStatement.setString(2, user.getLastname());
                    preparedStatement.setString(3, user.getLogin());
                    preparedStatement.setString(4, user.getPassword());
                    preparedStatement.setString(5, user.getDescription());
                    preparedStatement.setInt(6, user.getRoles_id());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int update(User user) {

        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql =
                        "UPDATE users SET firstname = ?, lastname = ?, login = ?, password = ?, description = ?, roles_id = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, user.getFirstname());
                    preparedStatement.setString(2, user.getLastname());
                    preparedStatement.setString(3, user.getLogin());
                    preparedStatement.setString(4, user.getPassword());
                    preparedStatement.setString(5, user.getDescription());
                    preparedStatement.setInt(6, user.getRoles_id());
                    preparedStatement.setInt(7, user.getId());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int delete(int id) {

        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "DELETE FROM users WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }
}
