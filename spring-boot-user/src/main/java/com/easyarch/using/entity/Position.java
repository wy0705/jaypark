package com.easyarch.using.entity;

public class Position {
    private int pid;
    private int num;
    private int salary;
    private String name;
    private int needid;

    public Position() {
    }

    public Position(int num, int salary, String name, int needid) {
        this.pid = pid;
        this.num = num;
        this.salary = salary;
        this.name = name;
        this.needid = needid;
    }

    public Position(int pid, int num, int salary, String name, int needid) {
        this.pid = pid;
        this.num = num;
        this.salary = salary;
        this.name = name;
        this.needid = needid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNeedid() {
        return needid;
    }

    public void setNeedid(int needid) {
        this.needid = needid;
    }
}
