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

public class gobase {
    private static Connection connection;

    public static Connection getCon() {
        if (connection == null) {
            try {
                Class.forName("org.h2.Driver"); // Use H2 JDBC driver class
                connection = DriverManager.getConnection("jdbc:h2:./data/goggles", "goggles", ""); // Specify H2 database URL
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return connection;
    }



    
    public static int saveGoData(GoData p) {
        int status = 0;
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement("INSERT INTO godata (gname, gnum, gcolor, gtype, gquantity, gbrand, gprice, gdate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, p.getGname());
            ps.setString(2, p.getGnum());
            ps.setString(3, p.getGcolor());
            ps.setString(4, p.getGtype());
            ps.setString(5, p.getGquantity());
            ps.setString(6, p.getGbrand());
            ps.setInt(7, p.getGprice());
            ps.setDate(8, java.sql.Date.valueOf(p.getGdate()));
            

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



    public static List<GoData> getAllOwnerData() {
        List<GoData> goDataList = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement(
                "SELECT id,gname, gnum, gcolor, gtype, gquantity, gbrand, gprice, gdate FROM godata");
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String gname = rs.getString("gname");
                String gnum = rs.getString("gnum");
                String gcolor = rs.getString("gcolor");
                String gtype = rs.getString("gtype");
                String gquantity = rs.getString("gquantity");
                String gbrand = rs.getString("gbrand");
                Integer gprice = rs.getInt("gprice");
               LocalDate gdate = rs.getDate("gdate").toLocalDate();
               

               GoData owner = new GoData(id,gname, gnum, gcolor, gtype, gquantity, gbrand, gprice, gdate);
               goDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
        return goDataList;
    }


    
    public static int update(GoData data) {
        int status = 0;
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement("UPDATE godata SET gname=?, gnum=?, gcolor=?, gtype=?, gquantity=?,gbrand=?,gprice=?,gdate=? WHERE id=?");

            ps.setString(1, data.getGname());
            ps.setString(2, data.getGnum());
            ps.setString(3, data.getGcolor());
            ps.setString(4, data.getGtype());
            ps.setString(5, data.getGquantity());
            ps.setString(6, data.getGbrand());
            ps.setInt(7, data.getGprice());
                       ps.setDate(8, java.sql.Date.valueOf(data.getGdate()));
            ps.setInt(9, data.getId()); // Assuming you have a method to get the product ID

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
             PreparedStatement ps = con.prepareStatement("DELETE FROM godata WHERE id = ?")) {
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



    public static List<GoData> getAllOwnerData3(String gname) {
        List<GoData> goDataList = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement("SELECT * FROM godata WHERE gname = ?")) {
            ps.setString(1, gname);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String gogglesName = rs.getString("gname"); // Renamed to gogglesName
                String gnum = rs.getString("gnum");
                String gcolor = rs.getString("gcolor");
                String gtype = rs.getString("gtype");
                String gquantity = rs.getString("gquantity");
                String gbrand = rs.getString("gbrand");
                Integer gprice = rs.getInt("gprice");
                LocalDate gdate = rs.getDate("gdate").toLocalDate();
    
                GoData owner = new GoData(id, gogglesName, gnum, gcolor, gtype, gquantity, gbrand, gprice, gdate);
                goDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
        return goDataList;
    }

}
