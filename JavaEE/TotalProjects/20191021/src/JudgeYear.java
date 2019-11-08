import java.util.Scanner;

public class JudgeYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份");
        try {
            long year = scan.nextLong();
            if (year % 4 == 0 && year % 100!= 0 || year % 400 == 0) {
                System.out.println(year+"是闰年");
            } else {
                System.out.println(year+"不是闰年");
            }
        } catch (Exception e) {
            System.out.println("输入不是有效年份");

        }
    }


}




