package org.demoproject.demogol;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lensetable {
    public static void main(String[] args) {
        lenseTable();
    }

    public static void lenseTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/lense", "lense", "")) {
            // Check if the table exists
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "LENSEDATA", null);
            if (resultSet.next()) {
                // Table already exists, do nothing
                System.out.println("Table LENSE already exists.");
                return;
            }

            // Table does not exist, create it
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE lensedata (" +
    "id INT AUTO_INCREMENT PRIMARY KEY," +
    "lname VARCHAR(255)," +
    "lcolor VARCHAR(255)," +
    "lnum VARCHAR(255)," +
    "ldate DATE," +
    "lprice INT CHECK (lprice <= 255)" +
    ")";
            statement.executeUpdate(sql);
            connection.commit();
            System.out.println("Table LENSE created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
