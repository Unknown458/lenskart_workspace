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

public class empbase {

    private static Connection connection;

    public static Connection getCon() {
        if (connection == null) {
            try {
                Class.forName("org.h2.Driver"); // Use H2 JDBC driver class
                connection = DriverManager.getConnection("jdbc:h2:./data/frame", "frame", ""); // Specify H2 database URL
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return connection;
    }

    public static int save(prodata p) {
        int status = 0;
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement("INSERT INTO framedata (pname, pno, pcolor, pshape, pqun, pbrand, ptype, ppro1date, pgqun11) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, p.getPname());
            ps.setString(2, p.getPno());
            ps.setString(3, p.getPcolor());
            ps.setString(4, p.getPshape());
            ps.setString(5, p.getPqun());
            ps.setString(6, p.getPbrand());
            ps.setString(7, p.getPtype());
            ps.setDate(8, java.sql.Date.valueOf(p.getPpro1date()));
            ps.setInt(9, p.getPgqun11());

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

    public static List<prodata> getAllOwnerData() {
        List<prodata> frameDataList = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement("SELECT id,pname, pno, pcolor, pshape, pqun, pbrand, ptype, ppro1date, pgqun11 FROM framedata");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String pname = rs.getString("pname");
                String pno = rs.getString("pno");
                String pcolor = rs.getString("pcolor");
                String pshape = rs.getString("pshape");
                String pqun = rs.getString("pqun");
                String pbrand = rs.getString("pbrand");
                String ptype = rs.getString("ptype");
                LocalDate ppro1date = rs.getDate("ppro1date").toLocalDate();
                Integer pgqun11 = rs.getInt("pgqun11");

                prodata owner = new prodata(id,pname, pno, pcolor, pshape, pqun, pbrand, ptype, ppro1date, pgqun11);
                frameDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
        return frameDataList;
    }

    public static int update(prodata data) {
        int status = 0;
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement("UPDATE framedata SET pname=?, pno=?, pcolor=?, pshape=?, pqun=?, pbrand=?, ptype=?, ppro1date=?, pgqun11=? WHERE id=?");

            ps.setString(1, data.getPname());
            ps.setString(2, data.getPno());
            ps.setString(3, data.getPcolor());
            ps.setString(4, data.getPshape());
            ps.setString(5, data.getPqun());
            ps.setString(6, data.getPbrand());
            ps.setString(7, data.getPtype());
            ps.setDate(8, java.sql.Date.valueOf(data.getPpro1date()));
            ps.setInt(9, data.getPgqun11());
            ps.setInt(10, data.getId()); // Assuming you have a method to get the product ID

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
             PreparedStatement ps = con.prepareStatement("DELETE FROM framedata WHERE id = ?")) {
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








    public static List<prodata> getAllOwnerData1(String pno) {
        List<prodata> frameDataList = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement("SELECT * FROM framedata WHERE pno = ?")) {
            ps.setString(1, pno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String pname = rs.getString("pname");
                String pnoValue = rs.getString("pno"); // Renamed to pnoValue
                String pcolor = rs.getString("pcolor");
                String pshape = rs.getString("pshape");
                String pqun = rs.getString("pqun");
                String pbrand = rs.getString("pbrand");
                String ptype = rs.getString("ptype");
                LocalDate ppro1date = rs.getDate("ppro1date").toLocalDate();
                Integer pgqun11 = rs.getInt("pgqun11");
    
                prodata owner = new prodata(id, pname, pnoValue, pcolor, pshape, pqun, pbrand, ptype, ppro1date, pgqun11);
                frameDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
        return frameDataList;
    }
}