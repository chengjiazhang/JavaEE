/*
序列化与对象克隆
 */
package com.banyuan.test03;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class CloneTest04 {
    public static void main(String[] args) {
        System.out.println("序列化之前");
        Address address=new Address("中国","吉林","长春");
        Employee employee1=new Employee("张三",30,address);
        System.out.println("员工1的信息：");
        System.out.println(employee1);
        System.out.println("序列化之后");
        ObjectOutputStream out=null;
        ObjectInputStream in=null;
        Employee employee2=null;

        try {
            out=new ObjectOutputStream(new FileOutputStream("employee.dat"));
            out.writeObject(employee1);
            in=new ObjectInputStream(new FileInputStream("employee.dat"));
            employee2=(Employee)in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(out==null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(in==null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if(employee2!=null){
            employee2.getAddress().setState("中国");
            employee2.getAddress().setProvince("四川");
            employee2.getAddress().setState("成都");
            employee2.setName("李四");
            employee2.setAge(20);

            System.out.println("员工1的信息：");
            System.out.println(employee1);
            System.out.println("员工2的信息");
            System.out.println(employee2);

        }
    }

}

class Address implements Serializable {
    private static final long serialVersionUID = 4983187187403615604L;
    private String state;
    private String province;
    private String city;

    public Address(String state, String province, String city) {
        this.state = state;
        this.province = province;
        this.city = city;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Employee implements Serializable {
    private static final long serialVersionUID = 3049633059823371192L;
    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
