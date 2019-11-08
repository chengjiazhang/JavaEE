package com.banyuan.test13;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewClassTest {
    public static void main(String[] args) {//获得File类的Constructor对象
        try {
            Constructor<File> constructor=File.class.getDeclaredConstructor(String.class);
            System.out.println("使用反射创建File对象");
            File file=constructor.newInstance("明日科技.txt");
            System.out.println("使用file对象创建文件：明日科技.txt");
            file.createNewFile();
            System.out.println("文件是否创建成功："+file.exists());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
