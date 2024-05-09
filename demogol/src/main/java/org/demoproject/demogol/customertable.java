package org.demoproject.demogol;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class customertable {
    public static void main(String[] args) {
        customerTable();
    }

    public static void customerTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/customer2", "customer2", "")) {
            // Check if the table exists
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "CUSTDATA2", null);
            if (resultSet.next()) {
                // Table already exists, do nothing
                System.out.println("Table CUSTDATA2 already exists.");
                return;
            }

            // Table does not exist, create it
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE custdata2 (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "cname NVARCHAR(255)," +
            "cmail NVARCHAR(255)," +
            "cphone NVARCHAR(255)," +
            "cadd NVARCHAR(255)," +
            "cdate DATE," +
            "cfname NVARCHAR(255)," +
            "cfcolor NVARCHAR(255)," +
            "cfshape NVARCHAR(255)," +
            "cfbrand NVARCHAR(255)," +
            "cftype NVARCHAR(255)," +
            "cframe NVARCHAR(255)," +
            "cfprice INT," +
            "clname NVARCHAR(255)," +
            "clcolor NVARCHAR(255)," +
            "clno NVARCHAR(255)," +
            "clprice INT," +
            "cgname NVARCHAR(255)," +
            "cgcolor NVARCHAR(255)," +
            "cgtype NVARCHAR(255)," +
            "cgbrand NVARCHAR(255)," +
            "cgprice INT," +
            "cdiscus INT CHECK (cdiscus <= 255)" +
            ")";
            statement.executeUpdate(sql);
            connection.commit();
            System.out.println("Table CUSTDATA2 created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}