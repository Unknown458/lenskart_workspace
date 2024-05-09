package org.demoproject.demogol;

import java.time.LocalDate;

public class ownerdata {
    private int id;
    private String fname, mail, phone, countryd, zipno, cityd, add, degree, depart, gender, salary, worktime, username, password;
    private LocalDate selectedDate;
    private byte[] image;
    public ownerdata() {}

    public ownerdata(int id, byte[] image, String fname,  String mail, String phone, String countryd, String zipno, String cityd, String add, String degree, String depart, String gender, LocalDate selectedDate, String salary, String worktime, String username, String password) {
        this.id = id;
        this.image = image;
        this.fname = fname;
        this.mail = mail;
        this.phone = phone;
        this.countryd = countryd;
        this.zipno = zipno;
        this.cityd = cityd;
        this.add = add;
        this.degree = degree;
        this.depart = depart;
        this.gender = gender;
        this.selectedDate = selectedDate;
        this.salary = salary;
        this.worktime = worktime;
        this.username = username;
        this.password = password;
    }
    
    public ownerdata(byte[] image, String fname,  String mail, String phone, String countryd, String zipno, String cityd, String add, String degree, String depart, String gender, LocalDate selectedDate, String salary, String worktime, String username, String password) {
        this.image = image;
        this.fname = fname;
        this.mail = mail;
        this.phone = phone;
        this.countryd = countryd;
        this.zipno = zipno;
        this.cityd = cityd;
        this.add = add;
        this.degree = degree;
        this.depart = depart;
        this.gender = gender;
        this.selectedDate = selectedDate;
        this.salary = salary;
        this.worktime = worktime;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountryd() {
        return countryd;
    }

    public void setCountryd(String countryd) {
        this.countryd = countryd;
    }

    public String getZipno() {
        return zipno;
    }

    public void setZipno(String zipno) {
        this.zipno = zipno;
    }

    public String getCityd() {
        return cityd;
    }

    public void setCityd(String cityd) {
        this.cityd = cityd;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(LocalDate selectedDate) {
        this.selectedDate = selectedDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
