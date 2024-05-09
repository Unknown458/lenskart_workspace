package org.demoproject.demogol;

import java.time.LocalDate;

public class GoData {
    private int id;
    private String gname;
    private String gnum;
    private String gcolor;
    private String gtype;
    private String gquantity;
    private String gbrand;
    private Integer gprice;
    private LocalDate gdate;

    public GoData() {
        // Default constructor
    }
    public GoData(int id, String gname, String gnum, String gcolor, String gtype, String gquantity, String gbrand, Integer gprice, LocalDate gdate) {
        this.id = id;
        this.gname = gname;
        this.gnum = gnum;
        this.gcolor = gcolor;
        this.gtype = gtype;
        this.gquantity = gquantity;
        this.gbrand = gbrand;
        this.gprice = gprice;
        this.gdate = gdate;
    }

    public GoData(String gname, String gnum, String gcolor, String gtype, String gquantity, String gbrand, Integer gprice, LocalDate gdate) {
        this.gname = gname;
        this.gnum = gnum;
        this.gcolor = gcolor;
        this.gtype = gtype;
        this.gquantity = gquantity;
        this.gbrand = gbrand;
        this.gprice = gprice;
        this.gdate = gdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGnum() {
        return gnum;
    }

    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    public String getGcolor() {
        return gcolor;
    }

    public void setGcolor(String gcolor) {
        this.gcolor = gcolor;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public String getGquantity() {
        return gquantity;
    }

    public void setGquantity(String gquantity) {
        this.gquantity = gquantity;
    }

    public String getGbrand() {
        return gbrand;
    }

    public void setGbrand(String gbrand) {
        this.gbrand = gbrand;
    }

    public Integer getGprice() {
        return gprice;
    }

    public void setGprice(Integer gprice) {
        this.gprice = gprice;
    }

    public LocalDate getGdate() {
        return gdate;
    }

    public void setGdate(LocalDate gdate) {
        this.gdate = gdate;
    }
}
