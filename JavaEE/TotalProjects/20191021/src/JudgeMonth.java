import java.util.Scanner;

public class JudgeMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = scan.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("您输入的月份属于冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("您输入的月份属于春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("您输入的月份属于夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("您输入的月份属于秋季");
                break;
            default:
                System.out.println("有这个月份吗");

        }

    }
}
