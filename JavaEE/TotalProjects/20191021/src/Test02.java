import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入新员工的姓名");
        String name = scan.nextLine();
        System.out.println("请输入新员工应聘的编程语言");
        String language = scan.nextLine();
        //编程语言确定新员工分配的部门
        switch (language.hashCode()) {
            case 3254818:  //java
            case 2301506://Java
            case 2269730://JAVA
                System.out.println("员工" + name + "被分到java程序开发部门");
                break;
            case 3104://c#
            case 2112://C#
                System.out.println("员工" + name + "被分到C#项目维护组");
                break;
            case -709190099://asp.net
            case 955463181://Asp.net
            case 9745901://ASP.NET
                System.out.println("员工" + name + "被分配到Asp.net程序测试部门");
                break;
            default:
                System.out.println("本公司不需要" + language + "语言的程序人员");


        }


    }


}
