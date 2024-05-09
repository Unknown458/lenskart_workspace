package org.demoproject.demogol;

import java.time.LocalDate;

public class prodata {
    private int id;
    private String pname;
    private String pno;
    private String pcolor;
    private String pshape;
    private String pqun;
    private String pbrand;
    private String ptype;
    private LocalDate ppro1date;
    private Integer pgqun11;

    public prodata() {
        // Default constructor
    }

    public prodata( int id, String pname, String pno, String pcolor, String pshape, String pqun, String pbrand, String ptype, LocalDate ppro1date, Integer pgqun11) {
        this.id = id;
        this.pname = pname;
        this.pno = pno;
        this.pcolor = pcolor;
        this.pshape = pshape;
        this.pqun = pqun;
        this.pbrand = pbrand;
        this.ptype = ptype;
        this.ppro1date = ppro1date;
        this.pgqun11 = pgqun11;
    }

    public prodata(String pname, String pno, String pcolor, String pshape, String pqun, String pbrand, String ptype, LocalDate ppro1date, Integer pgqun11) {
                this.pname = pname;
        this.pno = pno;
        this.pcolor = pcolor;
        this.pshape = pshape;
        this.pqun = pqun;
        this.pbrand = pbrand;
        this.ptype = ptype;
        this.ppro1date = ppro1date;
        this.pgqun11 = pgqun11;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPcolor() {
        return pcolor;
    }

    public void setPcolor(String pcolor) {
        this.pcolor = pcolor;
    }

    public String getPshape() {
        return pshape;
    }

    public void setPshape(String pshape) {
        this.pshape = pshape;
    }

    public String getPqun() {
        return pqun;
    }

    public void setPqun(String pqun) {
        this.pqun = pqun;
    }

    public String getPbrand() {
        return pbrand;
    }

    public void setPbrand(String pbrand) {
        this.pbrand = pbrand;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public LocalDate getPpro1date() {
        return ppro1date;
    }

    public void setPpro1date(LocalDate ppro1date) {
        this.ppro1date = ppro1date;
    }

    public Integer getPgqun11() {
        return pgqun11;
    }

    public void setPgqun11(Integer pgqun11) {
        this.pgqun11 = pgqun11;
    }
}
