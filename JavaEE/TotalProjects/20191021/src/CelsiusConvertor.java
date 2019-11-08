import java.util.Scanner;

public class CelsiusConvertor {
    public double getFahrenhit(double celsius){
        double fahrenhit=1.8*celsius+32;
        return fahrenhit;
    }
    public static void main(String[] args){
        System.out.println("请输入要转换的温度(单位：摄氏度)");
        Scanner in=new Scanner(System.in);
        double celsius=in.nextDouble();
        CelsiusConvertor convertor=new CelsiusConvertor();
        double fahrenhit=convertor.getFahrenhit(celsius);
        System.out.println("转化完成的温度(单位：华氏度)："+fahrenhit);

    }



}
