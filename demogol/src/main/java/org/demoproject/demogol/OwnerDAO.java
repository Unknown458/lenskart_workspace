package org.demoproject.demogol;
import java.sql.*;

public class OwnerDAO {
    private static final String DB_URL = "jdbc:h2:./data/test";
    private static final String USERNAME = "test";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            // Create table if not exists
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employeeda (id INT PRIMARY KEY AUTO_INCREMENT, fname VARCHAR(255), lname VARCHAR(255))";
            ps = connection.prepareStatement(createTableSQL);
            ps.executeUpdate();

            // Insert data
            String insertSQL = "INSERT INTO employeeda(fname, lname) VALUES (?, ?)";
            ps = connection.prepareStatement(insertSQL);
            ps.setString(1, "John");
            ps.setString(2, "Doe");
            ps.executeUpdate();

            // Retrieve data
            String selectSQL = "SELECT * FROM employeeda";
            ps = connection.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                System.out.println("ID: " + id + ", First Name: " + fname + ", Last Name: " + lname);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print the full stack trace for better error handling
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Print the full stack trace for better error handling
            }
        }
    }
}
