package com.banyuan.test13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//创建标注输入流扫描器
        System.out.println("请输入一个数字");
        double number = scan.nextDouble();//获取用户数字
        System.out.println("该数字用常量作为格式化对象的构造参数，将获得不同的货币格式");

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);//创建格式化对象
        System.out.println("Local.CHINA:" + format.format(number));//输出格式化货币格式

        format = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Local.US:" + format.format(number));
        format = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println("Local.ENGLISH:" + format.format(number));
        format = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        System.out.println("Local.TAIWAN:" + format.format(number));


    }


}
