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

public class ownerbase {
    private static Connection connection;

    public static Connection getCon() {
        if (connection == null) {
            try {
                Class.forName("org.h2.Driver"); // Use H2 JDBC driver class
                connection = DriverManager.getConnection("jdbc:h2:./data/test", "test", ""); // Specify H2 database URL
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return connection;
    }



    public static boolean validate(String fname, String passwords) {
        boolean status = false;
        try {
            Connection con = getCon();

            PreparedStatement ps = con.prepareStatement("select * from employeedata1 where username=? and password=?");
            ps.setString(1, fname);
            ps.setString(2, passwords);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int save(ownerdata o) {
        int status = 0;

        PreparedStatement ps = null;
        try {

            ps = getCon().prepareStatement("INSERT INTO employeedata1 (image, fname, mail, phone, countryd, zipno, cityd, `add`, degree, depart, gender, selectedDate, salary, worktime, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            // Set image data
            if (o.getImage() != null) {
                ps.setBytes(1, o.getImage());
            } else {
                ps.setNull(1, Types.BLOB);
            }

            // Set other data
            ps.setString(2, o.getFname());
            ps.setString(3, o.getMail());
            ps.setString(4, o.getPhone());
            ps.setString(5, o.getCountryd());
            ps.setString(6, o.getZipno());
            ps.setString(7, o.getCityd());
            ps.setString(8, o.getAdd());
            ps.setString(9, o.getDegree());
            ps.setString(10, o.getDepart());
            ps.setString(11, o.getGender());
            ps.setString(12, o.getSelectedDate().toString()); // Assuming selectedDate is a string
            ps.setString(13, o.getSalary());
            ps.setString(14, o.getWorktime());
            ps.setString(15, o.getUsername());
            ps.setString(16, o.getPassword());

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

    public static List<ownerdata> getAllOwnerData() {
        List<ownerdata> ownerDataList = new ArrayList<>();


            try (PreparedStatement ps = getCon().prepareStatement("SELECT  id, image,fname, mail, phone, countryd, zipno, cityd, `add`, degree, depart, gender, selectedDate,salary, worktime, username, password FROM employeedata1");
                 ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                int id = rs.getInt("id");
                byte[] image = rs.getBytes("image");
                String fname = rs.getString("fname");
                String mail = rs.getString("mail");
                String phone = rs.getString("phone");
                String countryd = rs.getString("countryd");
                String zipno = rs.getString("zipno");
                String cityd = rs.getString("cityd");
                String add = rs.getString("add");
                String degree = rs.getString("degree");
                String depart = rs.getString("depart");
                String gender = rs.getString("gender");
                LocalDate selectedDate = rs.getDate("selectedDate").toLocalDate();
                String salary = rs.getString("salary");
                String worktime = rs.getString("worktime");
                String username = rs.getString("username");
                String password = rs.getString("password");

                ownerdata owner = new ownerdata(id, image, fname, mail, phone, countryd, zipno, cityd, add, degree, depart, gender, selectedDate, salary, worktime, username, password);
                ownerDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ownerDataList;
    }

    public static int update(ownerdata updatedOwnerData) {
        int status = 0;
                PreparedStatement ps = null;
        try {

            ps = getCon().prepareStatement("UPDATE employeedata1 SET fname=?, mail=?, phone=?, countryd=?, zipno=?, cityd=?, add=?, degree=?, depart=?, gender=?, selectedDate=?, salary=?, worktime=?, password=?, image=? WHERE id=?");

            // Set parameters for the prepared statement
            ps.setString(1, updatedOwnerData.getFname());
            ps.setString(2, updatedOwnerData.getMail());
            ps.setString(3, updatedOwnerData.getPhone());
            ps.setString(4, updatedOwnerData.getCountryd());
            ps.setString(5, updatedOwnerData.getZipno());
            ps.setString(6, updatedOwnerData.getCityd());
            ps.setString(7, updatedOwnerData.getAdd());
            ps.setString(8, updatedOwnerData.getDegree());
            ps.setString(9, updatedOwnerData.getDepart());
            ps.setString(10, updatedOwnerData.getGender());
            ps.setObject(11, java.sql.Date.valueOf(updatedOwnerData.getSelectedDate()));
            ps.setString(12, updatedOwnerData.getSalary());
            ps.setString(13, updatedOwnerData.getWorktime());
            ps.setString(14, updatedOwnerData.getPassword());
            ps.setBytes(15, updatedOwnerData.getImage());
            ps.setInt(16, updatedOwnerData.getId());

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
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getCon();
            ps = con.prepareStatement("DELETE FROM employeedata1 WHERE id = ?");
            ps.setInt(1, ownerId);
            status = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

}