package org.demoproject.demogol;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {

    public static void main(String[] args) {
        createTable();
    }

    public static void createTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/test", "test", "")) {
            // Check if the table exists
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "EMPLOYEEDATA1", null);
            if (resultSet.next()) {
                // Table already exists, do nothing
                System.out.println("Table employeedata1 already exists.");
                return;
            }

            // Table does not exist, create it
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE employeedata1 (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "image BLOB,"+
                    "fname VARCHAR(255)," +
                    "mail VARCHAR(255)," +
                    "phone VARCHAR(255)," +
                    "countryd VARCHAR(255)," +
                    "zipno VARCHAR(255)," +
                    "cityd VARCHAR(255)," +
                    "add VARCHAR(255)," +
                    "degree VARCHAR(255)," +
                    "depart VARCHAR(255)," +
                    "gender VARCHAR(255)," +
                    "selectedDate DATE," +
                    "salary VARCHAR(255)," +
                    "worktime VARCHAR(255)," +
                    "username VARCHAR(255)," +
                    "password VARCHAR(255)" +
                  
                    ")";
            statement.executeUpdate(sql);
            connection.commit();
            System.out.println("Table employeedata1 created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
