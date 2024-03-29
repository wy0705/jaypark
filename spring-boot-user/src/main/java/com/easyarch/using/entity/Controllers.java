package com.easyarch.using.entity;

public class Controllers {
    private int cid;
    private String phone;
    private String password;

    public Controllers() {
    }

    public Controllers(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    public Controllers(int cid, String phone, String password) {
        this.cid = cid;
        this.phone = phone;
        this.password = password;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
