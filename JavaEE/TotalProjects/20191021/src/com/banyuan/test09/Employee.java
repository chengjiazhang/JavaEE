package com.banyuan.test09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.id > o.id ? 1 : -1;
    }//返回值1为升序，返回值-1降序
}

class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(3, "Java", 21));
        list.add(new Employee(2, "Java", 22));
        list.add(new Employee(1, "Java", 23));

        System.out.println("排序前");

        for (Employee employee : list) {
            System.out.println(employee);
        }

        System.out.println("排序后");

        Collections.sort(list);

        for (Employee employee : list) {
            System.out.println(employee);
        }


    }


}