package com.easyarch.using.entity;

public class Com_pos {
    private int eid;
    private int pid;

    public Com_pos() {
    }

    public Com_pos(int eid, int pid) {
        this.eid = eid;
        this.pid = pid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
