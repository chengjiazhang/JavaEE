package com.banyuan.ClassTest;

import java.util.Date;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("The first method：Object.getClass");
        Class c1 = new Date().getClass();//get the class Object
        System.out.println(c1.getName());//Output Object name
        System.out.println("The second method:.class grammar");
        Class c2 = boolean.class;
        System.out.println(c2.getName());
        System.out.println("The third method:Class.forName()");
        Class c3 = Class.forName("java.lang.String");
        System.out.println(c3.getName());
        System.out.println("The forth method:The type field of the wrapper class");
        Class c4 = Double.TYPE;//Use the wrapper class to get the class object
        System.out.println(c4.getName());//Output Object name

    }

}
