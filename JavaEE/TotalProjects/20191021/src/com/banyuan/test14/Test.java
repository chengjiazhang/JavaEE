package com.banyuan.test14;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args)  {
        try {
            Student student = new Student();
            Class<?> clazz = student.getClass();
            System.out.println("类的标准名称：" + clazz.getCanonicalName());

            Field id = clazz.getDeclaredField("id");
            System.out.println("设置前的id：" + student.getId());
            id.setAccessible(true);
            id.setInt(student, 10);
            System.out.println("设置后的id：" + student.getId());

            Field name = clazz.getDeclaredField("name");
            System.out.println("设置前的name：" + student.getName());
            name.setAccessible(true);
            name.set(student, "明日科技");
            System.out.println("设置后的name：" + student.getName());

            Field account=clazz.getDeclaredField("account");
            System.out.println("设置前的acount："+student.getAccount());
            account.setAccessible(true);
            account.setDouble(student,12.34);
            System.out.println("设置后的account："+student.getAccount());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
