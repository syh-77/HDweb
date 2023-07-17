package com.example.servlet_test.model;

public class UserModel {
    private int id;
    private String uname;
    private String sex;
    private String address;
    private String pwd;

    public UserModel() {
    }

    public UserModel(int id, String uname, String sex, String address, String pwd) {
        this.id = id;
        this.uname = uname;
        this.sex = sex;
        this.address = address;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
