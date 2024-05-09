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

public class cusbase {


    /////connection ////////////////////////////////////////////////
    private static Connection connection;

    public static Connection getCon() {
        if (connection == null) {
            try {
                Class.forName("org.h2.Driver"); // Use H2 JDBC driver class
                connection = DriverManager.getConnection("jdbc:h2:./data/customer2", "customer2", ""); // Specify H2 database URL
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return connection;
    }
/////connectionend//////////////////////////////////////////////



    ///save/////////////////////////////////////////////////////
    public static int save(cusdata p) {
        int status = 0;
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement("INSERT INTO custdata2 (cname, cmail, cphone, cadd, cdate, cframe, cfname, cfcolor, cfshape, cfbrand, cftype, cfprice, clname, clcolor, clno, clprice, cgname, cgcolor, cgtype, cgbrand, cgprice, cdiscus) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
            
            if (p.getCname() != null) {
                ps.setString(1, p.getCname());
            } else {
                ps.setNull(1, Types.VARCHAR);
            }
            
            if (p.getCmail() != null) {
                ps.setString(2, p.getCmail());
            } else {
                ps.setNull(2, Types.VARCHAR);
            }
            
            if (p.getCphone() != null) {
                ps.setString(3, p.getCphone());
            } else {
                ps.setNull(3, Types.VARCHAR);
            }
            
            if (p.getCadd() != null) {
                ps.setString(4, p.getCadd());
            } else {
                ps.setNull(4, Types.VARCHAR);
            }
            
            if (p.getCdate() != null) {
                ps.setDate(5, java.sql.Date.valueOf(p.getCdate()));
            } else {
                ps.setNull(5, Types.DATE);
            }
            
            if (p.getCframe() != null) {
                ps.setString(6, p.getCframe());
            } else {
                ps.setNull(6, Types.VARCHAR);
            }
            
            if (p.getCfname() != null) {
                ps.setString(7, p.getCfname());
            } else {
                ps.setNull(7, Types.VARCHAR);
            }
            
            if (p.getCfcolor() != null) {
                ps.setString(8, p.getCfcolor());
            } else {
                ps.setNull(8, Types.VARCHAR);
            }
            
            if (p.getCfshape() != null) {
                ps.setString(9, p.getCfshape());
            } else {
                ps.setNull(9, Types.VARCHAR);
            }
            
            if (p.getCfbrand() != null) {
                ps.setString(10, p.getCfbrand());
            } else {
                ps.setNull(10, Types.VARCHAR);
            }
            
            if (p.getCftype() != null) {
                ps.setString(11, p.getCftype());
            } else {
                ps.setNull(11, Types.VARCHAR);
            }
            
            if (p.getCfprice() != null) {
                ps.setInt(12, p.getCfprice());
            } else {
                ps.setNull(12, Types.INTEGER);
            }
            
            if (p.getClname() != null) {
                ps.setString(13, p.getClname());
            } else {
                ps.setNull(13, Types.VARCHAR);
            }
            
            if (p.getClcolor() != null) {
                ps.setString(14, p.getClcolor());
            } else {
                ps.setNull(14, Types.VARCHAR);
            }
            
            if (p.getClno() != null) {
                ps.setString(15, p.getClno());
            } else {
                ps.setNull(15, Types.VARCHAR);
            }
            
            if (p.getClprice() != null) {
                ps.setInt(16, p.getClprice());
            } else {
                ps.setNull(16, Types.INTEGER);
            }
            
            if (p.getCgname() != null) {
                ps.setString(17, p.getCgname());
            } else {
                ps.setNull(17, Types.VARCHAR);
            }
            
            if (p.getCgcolor() != null) {
                ps.setString(18, p.getCgcolor());
            } else {
                ps.setNull(18, Types.VARCHAR);
            }
            
            if (p.getCgtype() != null) {
                ps.setString(19, p.getCgtype());
            } else {
                ps.setNull(19, Types.VARCHAR);
            }
            
            if (p.getCgbrand() != null) {
                ps.setString(20, p.getCgbrand());
            } else {
                ps.setNull(20, Types.VARCHAR);
            }
            
            if (p.getCgprice() != null) {
                ps.setInt(21, p.getCgprice());
            } else {
                ps.setNull(21, Types.INTEGER);
            }
            
            if (p.getCdiscus() != null) {
                ps.setInt(22, p.getCdiscus());
            } else {
                ps.setNull(22,Types.INTEGER);
            }
            
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




    ////////for get alldata//////////////////////////////////////////////////////
    public static List<cusdata> getAllOwnerData() {
        List<cusdata> cusDataList = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement("SELECT id, cname, cmail, cphone, cadd, cdate, cframe, cfname, cfcolor, cfshape, cfbrand, cftype, cfprice, clname, clcolor, clno, clprice, cgname, cgcolor, cgtype, cgbrand, cgprice, cdiscus FROM custdata2");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String cname = rs.getString("cname");
                String cmail = rs.getString("cmail");
                String cphone = rs.getString("cphone");
                String cadd = rs.getString("cadd");
                LocalDate cdate = rs.getDate("cdate").toLocalDate();
                String cframe = rs.getString("cframe");
                String cfname = rs.getString("cfname");
                String cfcolor = rs.getString("cfcolor");
                String cfshape = rs.getString("cfshape");
                String cfbrand = rs.getString("cfbrand");
                String cftype = rs.getString("cftype");
                Integer cfprice = rs.getInt("cfprice");
                String clname = rs.getString("clname");
                String clcolor = rs.getString("clcolor");
                String clno = rs.getString("clno");
                Integer clprice = rs.getInt("clprice");
                String cgname = rs.getString("cgname");
                String cgcolor = rs.getString("cgcolor");
                String cgtype = rs.getString("cgtype");
                String cgbrand = rs.getString("cgbrand");
                Integer cgprice = rs.getInt("cgprice");
                Integer cdiscus = rs.getInt("cdiscus");
        
                cusdata owner = new cusdata(id, cname, cmail, cphone, cadd, cdate, cframe, cfname, cfcolor, cfshape, cfbrand, cftype, cfprice, clname, clcolor, clno, clprice, cgname, cgcolor, cgtype, cgbrand, cgprice, cdiscus);
                cusDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
        return cusDataList;
    }


    ///////////////////////////////////////////////////////////////////////////////

    /////////this get all data for recipt ////////////////////////////////////

    public static List<cusdata> getAllOwnerData5(int id) {
        List<cusdata> cusDataList = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement("SELECT id, cname, cmail, cphone, cadd, cdate, cframe, cfname, cfcolor, cfshape, cfbrand, cftype, cfprice, clname, clcolor, clno, clprice, cgname, cgcolor, cgtype, cgbrand, cgprice, cdiscus FROM custdata2 WHERE id = ?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int custId = rs.getInt("id");
                String cname = rs.getString("cname");
                String cmail = rs.getString("cmail");
                String cphone = rs.getString("cphone");
                String cadd = rs.getString("cadd");
                LocalDate cdate = rs.getDate("cdate").toLocalDate();
                String cframe = rs.getString("cframe");
                String cfname = rs.getString("cfname");
                String cfcolor = rs.getString("cfcolor");
                String cfshape = rs.getString("cfshape");
                String cfbrand = rs.getString("cfbrand");
                String cftype = rs.getString("cftype");
                Integer cfprice = rs.getInt("cfprice");
                String clname = rs.getString("clname");
                String clcolor = rs.getString("clcolor");
                String clno = rs.getString("clno");
                Integer clprice = rs.getInt("clprice");
                String cgname = rs.getString("cgname");
                String cgcolor = rs.getString("cgcolor");
                String cgtype = rs.getString("cgtype");
                String cgbrand = rs.getString("cgbrand");
                Integer cgprice = rs.getInt("cgprice");
                Integer cdiscus = rs.getInt("cdiscus");
                
                cusdata owner = new cusdata(custId, cname, cmail, cphone, cadd, cdate, cframe, cfname, cfcolor, cfshape, cfbrand, cftype, cfprice, clname, clcolor, clno, clprice, cgname, cgcolor, cgtype, cgbrand, cgprice, cdiscus);
                cusDataList.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cusDataList;
    }


    //////updatadata//////////////////////////////////////////////

    public static int update(cusdata data) {
        int status = 0;
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement("UPDATE custdata2 SET cname=?, cmail=?, cphone=?, cadd=?, cdate=?, cframe=?, cfname=?, cfcolor=?, cfshape=?, cfbrand=?, cftype=?, cfprice=?, clname=?, clcolor=?, clno=?, clprice=?, cgname=?, cgcolor=?, cgtype=?, cgbrand=?, cgprice=?, cdiscus=? WHERE id=?");
            
            ps.setString(1, data.getCname());
            ps.setString(2, data.getCmail());
            ps.setString(3, data.getCphone());
            ps.setString(4, data.getCadd());
            ps.setDate(5, java.sql.Date.valueOf(data.getCdate()));
            ps.setString(6, data.getCframe());
            ps.setString(7, data.getCfname());
            ps.setString(8, data.getCfcolor());
            ps.setString(9, data.getCfshape());
            ps.setString(10, data.getCfbrand());
            ps.setString(11, data.getCftype());
            ps.setInt(12, data.getCfprice());
            ps.setString(13, data.getClname());
            ps.setString(14, data.getClcolor());
            ps.setString(15, data.getClno());
            ps.setInt(16, data.getClprice());
            ps.setString(17, data.getCgname());
            ps.setString(18, data.getCgcolor());
            ps.setString(19, data.getCgtype());
            ps.setString(20, data.getCgbrand());
            ps.setInt(21, data.getCgprice());
            ps.setInt(22, data.getCdiscus());
            ps.setInt(23, data.getId()); // Assuming you have a method to get the customer ID
            
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



    ///for deleate butoon removedata ///////////////////////////////////////////////////
    
    public static int deleteOwnerData(int ownerId) {
        int status = 0;
        try (Connection con = getCon();
             PreparedStatement ps = con.prepareStatement("DELETE FROM custdata2 WHERE id = ?")) {
            ps.setInt(1, ownerId);
            status = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    ///make conection null (NO USE!)/////////////////////////////////////
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

