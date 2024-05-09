package org.demoproject.demogol;

import java.time.LocalDate;

public class cusdata {

    private int id;
    private String cname;
    private String cmail;
    private String cphone;
    private String cadd;
    private LocalDate cdate;
    private String cframe;
    private String cfname;
    private String cfcolor;
    private String cfshape;
    private String cfbrand;
    private String cftype;
    private Integer cfprice;
    private String clname;
    private String clcolor;
    private String clno;
    private Integer clprice;
    private String cgname;
    private String cgcolor;
    private String cgtype;
    private String cgbrand;
    private Integer cgprice;
    private Integer cdiscus;

    public cusdata(int id,  String cname, String cmail, String cphone, String cadd, LocalDate cdate, String cframe, String cfname, String cfcolor, String cfshape, String cfbrand, String cftype, Integer cfprice, String clname, String clcolor, String clno, Integer clprice, String cgname, String cgcolor, String cgtype, String cgbrand, Integer cgprice, Integer cdiscus) {
       this.id = id;
        this.cname = cname;
        this.cmail = cmail;
        this.cphone = cphone;
        this.cadd = cadd;
        this.cdate = cdate;
        this.cframe = cframe;
        this.cfname = cfname;
        this.cfcolor = cfcolor;
        this.cfshape = cfshape;
        this.cfbrand = cfbrand;
        this.cftype = cftype;
        this.cfprice = cfprice;
        this.clname = clname;
        this.clcolor = clcolor;
        this.clno = clno;
        this.clprice = clprice;
        this.cgname = cgname;
        this.cgcolor = cgcolor;
        this.cgtype = cgtype;
        this.cgbrand = cgbrand;
        this.cgprice = cgprice;
        this.cdiscus = cdiscus;
    }

    public cusdata(String cname, String cmail, String cphone, String cadd, LocalDate cdate, String cframe, String cfname, String cfcolor, String cfshape, String cfbrand, String cftype, Integer cfprice, String clname, String clcolor, String clno, Integer clprice, String cgname, String cgcolor, String cgtype, String cgbrand, Integer cgprice, Integer cdiscus) {
        this.cname = cname;
        this.cmail = cmail;
        this.cphone = cphone;
        this.cadd = cadd;
        this.cdate = cdate;
        this.cframe = cframe;
        this.cfname = cfname;
        this.cfcolor = cfcolor;
        this.cfshape = cfshape;
        this.cfbrand = cfbrand;
        this.cftype = cftype;
        this.cfprice = cfprice;
        this.clname = clname;
        this.clcolor = clcolor;
        this.clno = clno;
        this.clprice = clprice;
        this.cgname = cgname;
        this.cgcolor = cgcolor;
        this.cgtype = cgtype;
        this.cgbrand = cgbrand;
        this.cgprice = cgprice;
        this.cdiscus = cdiscus;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCmail() {
        return cmail;
    }

    public void setCmail(String cmail) {
        this.cmail = cmail;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCadd() {
        return cadd;
    }

    public void setCadd(String cadd) {
        this.cadd = cadd;
    }

    public LocalDate getCdate() {
        return cdate;
    }

    public void setCdate(LocalDate cdate) {
        this.cdate = cdate;
    }

    public String getCframe() {
        return cframe;
    }

    public void setCframe(String cframe) {
        this.cframe = cframe;
    }

    public String getCfname() {
        return cfname;
    }

    public void setCfname(String cfname) {
        this.cfname = cfname;
    }

    public String getCfcolor() {
        return cfcolor;
    }

    public void setCfcolor(String cfcolor) {
        this.cfcolor = cfcolor;
    }

    public String getCfshape() {
        return cfshape;
    }

    public void setCfshape(String cfshape) {
        this.cfshape = cfshape;
    }

    public String getCfbrand() {
        return cfbrand;
    }

    public void setCfbrand(String cfbrand) {
        this.cfbrand = cfbrand;
    }

    public String getCftype() {
        return cftype;
    }

    public void setCftype(String cftype) {
        this.cftype = cftype;
    }

    public Integer getCfprice() {
        return cfprice;
    }

    public void setCfprice(Integer cfprice) {
        this.cfprice = cfprice;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname;
    }

    public String getClcolor() {
        return clcolor;
    }

    public void setClcolor(String clcolor) {
        this.clcolor = clcolor;
    }

    public String getClno() {
        return clno;
    }

    public void setClno(String clno) {
        this.clno = clno;
    }

    public Integer getClprice() {
        return clprice;
    }

    public void setClprice(Integer clprice) {
        this.clprice = clprice;
    }

    public String getCgname() {
        return cgname;
    }

    public void setCgname(String cgname) {
        this.cgname = cgname;
    }

    public String getCgcolor() {
        return cgcolor;
    }

    public void setCgcolor(String cgcolor) {
        this.cgcolor = cgcolor;
    }

    public String getCgtype() {
        return cgtype;
    }

    public void setCgtype(String cgtype) {
        this.cgtype = cgtype;
    }

    public String getCgbrand() {
        return cgbrand;
    }

    public void setCgbrand(String cgbrand) {
        this.cgbrand = cgbrand;
    }

    public Integer getCgprice() {
        return cgprice;
    }

    public void setCgprice(Integer cgprice) {
        this.cgprice = cgprice;
    }

    public Integer getCdiscus() {
        return cdiscus;
    }

    public void setCdiscus(Integer cdiscus) {
        this.cdiscus = cdiscus;
    }

}
