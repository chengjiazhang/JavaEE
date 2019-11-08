package com.banyuan.student;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map map = new HashMap();
        Student s1 = new Student(200101, "小明", 92, 98, 85, 90, 91);
        Student s2 = new Student(200102, "小红", 99, 90, 82, 95, 95);
        Student s3 = new Student(200103, "小刚", 97, 89, 84, 97, 98);
        Student s4 = new Student(200104, "小强", 91, 90, 90, 92, 91);
        Student s5 = new Student(200105, "小胖", 92, 87, 88, 100, 100);
        map.put(200101, s1);
        map.put(200102, s2);
        map.put(200103, s3);
        map.put(200104, s4);
        map.put(200105, s5);

        System.out.println("请输入学号：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(map.get((Object) a));


    }


}
