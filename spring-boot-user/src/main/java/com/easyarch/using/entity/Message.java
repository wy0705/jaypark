package com.easyarch.using.entity;

public class Message {
    private int mid;
    private String name;
    private String email;
    private String birthday;
    private String gender;
    private int salary;
    private String permanentAddress;

    public Message() {
    }

    public Message(String name, String email, String birthday, String gender, int salary, String permanentAddress) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
        this.permanentAddress = permanentAddress;
    }

    public Message(int mid, String name, String email, String birthday, String gender, int salary, String permanentAddress) {
        this.mid = mid;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
        this.permanentAddress = permanentAddress;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
}
