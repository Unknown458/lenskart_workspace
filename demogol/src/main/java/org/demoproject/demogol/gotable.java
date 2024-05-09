package org.demoproject.demogol;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class gotable {
    public static void main(String[] args) {
        goTable();
    }

    public static void goTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/goggles", "goggles", "")) {
            // Check if the table exists
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "GODATA", null);
            if (resultSet.next()) {
                // Table already exists, do nothing
                System.out.println("Table GO already exists.");
                return;
            }

            // Table does not exist, create it
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE godata (" +
    "id INT AUTO_INCREMENT PRIMARY KEY," +
    "gname VARCHAR(255)," +
    "gnum VARCHAR(255)," +
    "gcolor VARCHAR(255)," +
    "gtype VARCHAR(255)," +
    "gquantity VARCHAR(255)," +
    "gbrand VARCHAR(255)," +
    "gprice INT CHECK (gprice <= 255)," +
    "gdate DATE" +
    ")";
            statement.executeUpdate(sql);
            connection.commit();
            System.out.println("Table GO created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
