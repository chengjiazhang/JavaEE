import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入登陆用户名");
        String username = scan.nextLine();
        System.out.println("请输入登陆密码");
        String password = scan.nextLine();
        if (username.equals("zcj") && password.equals("123456")) {
            System.out.println("输入正确");
            System.out.println("恭喜您验证通过");
        } else {
            System.out.println("输入错误");
        }

    }


}
