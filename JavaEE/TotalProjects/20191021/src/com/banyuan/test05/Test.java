package com.banyuan.test05;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("张三");
        employee.setBirthday(new Date());
        Manager manager=new Manager();
        manager.setName("明日科技");
        manager.setSalary(3000);
        manager.setBirthday(new Date());
        manager.setBonus(2000);

        System.out.println("员工的姓名："+employee.getName());
        System.out.println("员工的工资："+employee.getSalary());
        System.out.println("员工的生日："+employee.getBirthday());
        System.out.println("经理的姓名："+manager.getName());
        System.out.println("经理的工资："+manager.getSalary());
        System.out.println("经理的生日："+manager.getBirthday());
        System.out.println("经理的奖金："+manager.getBonus());





    }



}
