package org.demoproject.demogol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class lensbase {

    private static Connection connection;

    public static Connection getCon() {
        if (connection == null) {
            try {
                Class.forName("org.h2.Driver"); // Use H2 JDBC driver class
                connection = DriverManager.getConnection("jdbc:h2:./data/lense", "lense", ""); // Specify H2 database
                                                                                               // URL
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return connection;
    }

    public static int saveLensData(LensData l) {
        int status = 0;
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement(
                    "INSERT INTO lensedata (lname, lcolor, lnum, ldate, lprice) VALUES (?, ?, ?, ?, ?)");

            ps.setString(1, l.getLname());
            ps.setString(2, l.getLcolor());
            ps.setString(3, l.getLnum());
            ps.setDate(4, java.sql.Date.valueOf(l.getLdate()));
            ps.setInt(5, l.getLprice());

            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return status;
    }

    public static List<LensData> getAllOwnerData() {
        List<LensData> lensDataList = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement(
                "SELECT id,lname, lcolor, lnum, ldate, lprice FROM lensedata");
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String lname = rs.getString("lname");
                String lcolor = rs.getString("lcolor");
                String lnum = rs.getString("lnum");
               LocalDate ldate = rs.getDate("ldate").toLocalDate();
                Integer lprice = rs.getInt("lprice");

                LensData owner = new LensData(id, lname, lcolor, lnum, ldate, lprice);
                lensDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
        return lensDataList;
    }




    
    public static int update(LensData data) {
        int status = 0;
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement("UPDATE lensedata SET lname=?, lcolor=?, lnum=?, ldate=?, lprice=? WHERE id=?");

            ps.setString(1, data.getLname());
            ps.setString(2, data.getLcolor());
            ps.setString(3, data.getLnum());
                       ps.setDate(4, java.sql.Date.valueOf(data.getLdate()));
            ps.setInt(5, data.getLprice());
            ps.setInt(6, data.getId()); // Assuming you have a method to get the product ID

            status = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return status;
    }


    public static int deleteOwnerData(int ownerId) {
        int status = 0;
        try (Connection con = getCon();
             PreparedStatement ps = con.prepareStatement("DELETE FROM lensedata WHERE id = ?")) {
            ps.setInt(1, ownerId);
            status = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }


    
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



    public static List<LensData> getAllOwnerData2(String lname) {
        List<LensData> lensDataList = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement("SELECT * FROM lensedata WHERE lname = ?")) {
            ps.setString(1, lname);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String lensName = rs.getString("lname"); // Renamed to lensName
                String lcolor = rs.getString("lcolor");
                String lnum = rs.getString("lnum");
                LocalDate ldate = rs.getDate("ldate").toLocalDate();
                Integer lprice = rs.getInt("lprice");
    
                LensData owner = new LensData(id, lensName, lcolor, lnum, ldate, lprice);
                lensDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
        return lensDataList;
    }
}
