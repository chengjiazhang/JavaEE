package com.banyuan.test13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsefulArray {
    public static Object increaseArray(Object array) {
        //获得代表数组的class对象
        Class<?> clazz = array.getClass();
        //如果输入是一个数组
        if (clazz.isArray()) {
            //获得输入数组元素的类型
            Class<?> componentType = clazz.getComponentType();
            //获得输入数组的长度
            int length = Array.getLength(array);
            //新建数组
            Object newArray = Array.newInstance(componentType, length + 5);
            //复制原来数组所有数据
            System.arraycopy(array, 0, newArray, 0, length);
            //返回新建数组
            return newArray;
        }
        //如果输入的不是数组就返回空
        return null;

    }

    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.println("整型数组原始长度是：" + intArray.length);
        Arrays.fill(intArray, 8);//将数组元素全部赋值为8
        System.out.println("整型数组内容");
        System.out.println(Arrays.toString(intArray));
        int[] newIntArray = (int[]) increaseArray(intArray);//增加数组长度
        System.out.println("整型数组扩展后长度是：" + newIntArray.length);
        System.out.println("整型数组的内容：");
        System.out.println(Arrays.toString(newIntArray));


    }


}
