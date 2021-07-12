package com.easyarch.using.entity;

public class User1 {
    private int uid;
    private String phone;
    private String password;
    private int mid;

    public User1() {
    }

    public User1(String phone, String password, int mid) {
        this.phone = phone;
        this.password = password;
        this.mid = mid;
    }

    public User1(int uid, String phone, String password, int mid) {
        this.uid = uid;
        this.phone = phone;
        this.password = password;
        this.mid = mid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}
