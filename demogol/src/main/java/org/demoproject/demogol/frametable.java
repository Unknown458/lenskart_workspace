package org.demoproject.demogol;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class frametable {

    public static void main(String[] args) {
        frameTable();
    }

    public static void frameTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/frame", "frame", "")) {
            // Check if the table exists
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "FRAMEDATA", null);
            if (resultSet.next()) {
                // Table already exists, do nothing
                System.out.println("Table FRAME already exists.");
                return;
            }

            // Table does not exist, create it
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE framedata (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                                     "pname VARCHAR(255)," +
                    "pno VARCHAR(255)," +
                    "pcolor VARCHAR(255)," +
                    "pshape VARCHAR(255)," +
                    "pqun VARCHAR(255)," +
                    "pbrand VARCHAR(255)," +
                    "ptype VARCHAR(255)," +
                    "ppro1date DATE," +
                    "pgqun11 INT" +
                   
                  
                    ")";
            statement.executeUpdate(sql);
            connection.commit();
            System.out.println("Table FFFF created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
