package com.banyuan.test15;

public class Test {

    public static void main(String[] args) {
    Student s1=new Student("小红",10,10001,01);
    Student s2=new Student("小明",10,10002,01);
    Student s3=new Student("小红",10,10003,02);
    Class c1=new Class("盘古",01,s1);
    Class c2=new Class("战国",02,s3);
        if(c1.getS1().getName().equals(c2.getS1().getName())){
            System.out.println(c1);
            System.out.println(c2);
        }
    }
}
