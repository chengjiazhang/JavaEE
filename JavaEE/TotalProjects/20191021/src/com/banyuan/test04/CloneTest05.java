package com.banyuan.test04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CloneTest05 {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee = new Employee("李四", 20);
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            employees.add(employee.clone());
        }

        System.out.println("克隆花费时间：" + (System.currentTimeMillis() - currentTime) + "毫秒");

        currentTime = System.currentTimeMillis();//获得当前时间
        for (int i = 0; i < 10000; i++) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream out = null;

            try {
                out = new ObjectOutputStream(baos);
                out.writeObject(employee);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out== null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream in = null;


            try {
                in=new ObjectInputStream(bais);
                employees.add((Employee)in.readObject());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {

                if (in == null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        System.out.println("序列化花费时间："+(System.currentTimeMillis()-currentTime)+"毫秒");

        }

    }


class Employee implements Cloneable, Serializable {
    private static final long serialVersionUID = 5022956767440380940L;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee employee = null;
        employee = (Employee) super.clone();
        return employee;
    }
}
