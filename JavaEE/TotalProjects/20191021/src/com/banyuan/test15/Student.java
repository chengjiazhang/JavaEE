package com.banyuan.test15;

public class Student {
    private String name;
    private int age;
    private int id;
    private int cid;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Student(String name, int age, int id, int cid) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", cid=" + cid +
                '}';
    }
}
