package com.easyarch.using.entity;

public class Message {
    private int mid;
    private String name;
    private int age;
    private String gender;
    private String email;
    private int drivingyears;
    private String vehicle;

    public Message() {
    }

    public Message(String name, int age, String gender, String email, int drivingyears, String vehicle) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.drivingyears = drivingyears;
        this.vehicle = vehicle;
    }

    public Message(int mid, String name, int age, String gender, String email, int drivingyears, String vehicle) {
        this.mid = mid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.drivingyears = drivingyears;
        this.vehicle = vehicle;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDrivingyears() {
        return drivingyears;
    }

    public void setDrivingyears(int drivingyears) {
        this.drivingyears = drivingyears;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
