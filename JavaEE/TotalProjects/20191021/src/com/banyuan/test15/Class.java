package com.banyuan.test15;

public class Class {
    private String name;
    private int cid;

    Student s1;

    public Class(String name, int cid, Student s1) {
        this.name = name;
        this.cid = cid;
        this.s1 = s1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Student getS1() {
        return s1;
    }

    public void setS1(Student s1) {
        this.s1 = s1;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", cid=" + cid +
                ", s1=" + s1 +
                '}';
    }
}
