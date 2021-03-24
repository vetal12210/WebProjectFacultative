package com.example.FacultativeProject.subjects;

import java.sql.*;
import java.util.ArrayList;

/**
 * SubjectDB
 *
 * @author V.Dulsky
 */

public class SubjectDB {

    private static final String url = "jdbc:postgresql://localhost:5432/facultativeMyProj";
    private static final String username = "postgres";
    private static final String password = "aaaaa55555";


    public static ArrayList<Subject> select() {

        ArrayList<Subject> subjects = new ArrayList<Subject>();
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM subjects ORDER BY categories_id");
                while (resultSet.next()) {

                    int id = resultSet.getInt(1);
                    String sname = resultSet.getString(2);
                    int categories_id = resultSet.getInt(3);
                    Subject subject = new Subject(id, sname, categories_id);
                    subjects.add(subject);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return subjects;
    }


    public static Subject selectOne(String sname) {

        Subject subject = null;
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "SELECT * FROM subjects WHERE sname=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, sname);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {

                        int id = resultSet.getInt(1);
                        String subjName = resultSet.getString(2);
                        int categories_id = resultSet.getInt(3);
                        subject = new Subject(id, subjName, categories_id);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return subject;
    }

    public static int insert(Subject subject) {

        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "INSERT INTO subjects (sname, categories_id) Values (?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, subject.getSname());
                    preparedStatement.setInt(2, subject.getCategories_id());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int update(Subject subject) {

        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql =
                        "UPDATE subjects SET sname = ?, categories_id = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, subject.getSname());
                    preparedStatement.setInt(2, subject.getCategories_id());
                    preparedStatement.setInt(3, subject.getId());

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

                String sql = "DELETE FROM subjects WHERE id = ?";
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
