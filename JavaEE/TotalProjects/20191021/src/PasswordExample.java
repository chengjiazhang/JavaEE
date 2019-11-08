import java.util.Scanner;

public class PasswordExample {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个解密字符串");
        String password=scanner.nextLine();
        char[] array=password.toCharArray();//字符串转化为数组
        for(int i=0;i<array.length;i++){
            array[i]=(char)(array[i]^20000);
        }
        System.out.println("加密的结果如下：");
        System.err.println(new String(array));
    }
}
