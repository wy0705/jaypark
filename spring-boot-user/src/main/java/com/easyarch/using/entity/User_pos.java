package com.easyarch.using.entity;

public class User_pos {
    private int uid;
    private int pid;

    public User_pos(int uid, int pid) {
        this.uid = uid;
        this.pid = pid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
