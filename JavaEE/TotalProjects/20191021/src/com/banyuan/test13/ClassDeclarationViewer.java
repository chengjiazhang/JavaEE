package com.banyuan.test13;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class ClassDeclarationViewer {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.util.ArrayList");//Get the Arraylist class object
        System.out.println("Get the Arraylist class object" + clazz.getCanonicalName());
        System.out.println("Class modifier" + Modifier.toString(clazz.getModifiers()));

        TypeVariable<?>[] typeVariables = clazz.getTypeParameters();
        System.out.println("The class generic paramete");

        if (typeVariables.length != 0)
            for (TypeVariable<?> typeVariable : typeVariables) {
                System.out.println(typeVariable + "\t");
            }
        else {
            System.out.println("空");
        }
        //Outputs all interfaces implemented by the class
        Type[] interfaces = clazz.getGenericInterfaces();
        System.out.println("interfaces implemented by the class");
        if (interfaces.length != 0) {
            for (Type type : interfaces) {
                System.out.println("\t" + type);

            }
        } else {
            System.out.println("\t" + "空");
        }//Direct inheritance of the output class, or null if inherited from Object

        Type superClass = clazz.getGenericSuperclass();
        System.out.println("类的直接继承类");
        if (superClass != null) {
            System.out.println(superClass);
        } else {
            System.out.println("空");
        }//输出类的所有注释信息，有些注释信息是不能用反射获得的
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println("类的注解");
        if (annotations.length != 0) {
            for (Annotation annotation : annotations) {
                System.out.println("\t" + annotation);
            }
        } else {
            System.out.println("空");
        }

    }

}
