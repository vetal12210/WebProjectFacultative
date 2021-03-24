package com.example.FacultativeProject.directionOfStudy;

import java.sql.*;
import java.util.ArrayList;

/**
 * DirectionOfStudyDB
 *
 * @author V.Dulsky
 */
public class DirectionOfStudyDB {

    private static final String url = "jdbc:postgresql://localhost:5432/facultativeMyProj";
    private static final String username = "postgres";
    private static final String password = "aaaaa55555";

    public static ArrayList<DirectionOfStudy> select() {

        ArrayList<DirectionOfStudy> directionOfStudies = new ArrayList<DirectionOfStudy>();
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM directionOfStudy");
                while (resultSet.next()) {

                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    int price = resultSet.getInt(3);
                    int users_id = resultSet.getInt(4);
                    int statuses_id = resultSet.getInt(5);
                    DirectionOfStudy directionOfStudy = new DirectionOfStudy(id, name, price, users_id, statuses_id);
                    directionOfStudies.add(directionOfStudy);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return directionOfStudies;
    }


    public static DirectionOfStudy selectOne(int id) {

        DirectionOfStudy directionOfStudy = null;
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "SELECT * FROM directionOfStudy WHERE id=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {

                        int iD = resultSet.getInt(1);
                        String name = resultSet.getString(2);
                        int price = resultSet.getInt(3);
                        int users_id = resultSet.getInt(4);
                        int statuses_id = resultSet.getInt(5);
                        directionOfStudy = new DirectionOfStudy(iD, name, price, users_id, statuses_id);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return directionOfStudy;
    }

    public static int insert(DirectionOfStudy directionOfStudy) {

        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "INSERT INTO directionOfStudy(name, price, users_id, statuses_id) Values (?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, directionOfStudy.getName());
                    preparedStatement.setInt(2, directionOfStudy.getPrice());
                    preparedStatement.setInt(3, directionOfStudy.getUsers_id());
                    preparedStatement.setInt(4, directionOfStudy.getStatuses_id());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int update(DirectionOfStudy directionOfStudy) {

        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql =
                        "UPDATE directionOfStudy SET name = ?, price = ?, users_id = ?, statuses_id = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, directionOfStudy.getName());
                    preparedStatement.setInt(2, directionOfStudy.getPrice());
                    preparedStatement.setInt(3, directionOfStudy.getUsers_id());
                    preparedStatement.setInt(4, directionOfStudy.getStatuses_id());

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

                String sql = "DELETE FROM directionOfStudy WHERE id = ?";
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
