package org.demoproject.demogol;

import java.time.LocalDate;

public class LensData {
    private int id;
    private String lname;
    private String lcolor;
    private String lnum;
    private LocalDate ldate;
    private Integer lprice;

    public LensData() {
        // Default constructor
    }

    public LensData( int id, String lname, String lcolor, String lnum, LocalDate ldate, Integer lprice) {
        this.id = id;
        this.lname = lname;
        this.lcolor = lcolor;
        this.lnum = lnum;
        this.ldate = ldate;
        this.lprice = lprice;
    }
    public LensData(String lname, String lcolor, String lnum, LocalDate ldate, Integer lprice) {
        this.lname = lname;
        this.lcolor = lcolor;
        this.lnum = lnum;
        this.ldate = ldate;
        this.lprice = lprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLcolor() {
        return lcolor;
    }

    public void setLcolor(String lcolor) {
        this.lcolor = lcolor;
    }

    public String getLnum() {
        return lnum;
    }

    public void setLnum(String lnum) {
        this.lnum = lnum;
    }

    public LocalDate getLdate() {
        return ldate;
    }

    public void setLdate(LocalDate ldate) {
        this.ldate = ldate;
    }

    public Integer getLprice() {
        return lprice;
    }

    public void setLprice(Integer lprice) {
        this.lprice = lprice;
    }
}
