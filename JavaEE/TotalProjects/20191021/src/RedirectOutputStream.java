
/*
重定向输出流实现程序日志
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = System.out;
        PrintStream ps = new PrintStream("./log.txt");
        System.setOut(ps);
        int age = 18;
        System.out.println("年龄变量成功定义，初始值为18");
        String sex = "女";
        System.out.println("性别变量成功定义，初始值为女");
        //整合俩个变量
        String info = "这是个" + sex + "孩子" + "应该有" + age + "岁了";
        System.out.println("info===：" + info);
        System.setOut(out);
        System.out.println("运行结束，查看日志文件。");
    }


}
