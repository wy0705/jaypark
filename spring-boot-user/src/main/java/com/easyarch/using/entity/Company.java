package com.easyarch.using.entity;

public class Company {
    private int eid;
    private String name;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Company(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
