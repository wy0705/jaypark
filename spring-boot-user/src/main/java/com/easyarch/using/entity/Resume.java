package com.easyarch.using.entity;

public class Resume {
    private int pid;
    private int uid;

    public Resume() {
    }

    public Resume(int pid, int uid) {
        this.pid = pid;
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
