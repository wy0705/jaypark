package com.easyarch.using.entity;

import jdk.nashorn.internal.ir.CallNode;

public class Need {
    private int needid;
    private int agemax;
    private String gender;
    private int drivingyear;
    private String vehicle;

    public Need() {
    }

    public Need(int agemax, String gender, int drivingyear, String vehicle) {
        this.agemax = agemax;
        this.gender = gender;
        this.drivingyear = drivingyear;
        this.vehicle = vehicle;
    }

    public Need(int needid, int agemax, String gender, int drivingyear, String vehicle) {
        this.needid = needid;
        this.agemax = agemax;
        this.gender = gender;
        this.drivingyear = drivingyear;
        this.vehicle = vehicle;
    }

    public int getNeedid() {
        return needid;
    }

    public void setNeedid(int needid) {
        this.needid = needid;
    }

    public int getAgemax() {
        return agemax;
    }

    public void setAgemax(int agemax) {
        this.agemax = agemax;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDrivingyear() {
        return drivingyear;
    }

    public void setDrivingyear(int drivingyear) {
        this.drivingyear = drivingyear;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
