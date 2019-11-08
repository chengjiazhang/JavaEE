import java.math.BigDecimal;

public class Test03 {
    public static void main(String[] args) {
        BigDecimal sum=new BigDecimal(0.0);
        System.out.println("sum=="+sum);
        BigDecimal factorial=new BigDecimal(1.0);
        System.out.println("factorial=="+factorial);
        int i=1;
        while(i<=20){
            sum=sum.add(factorial);//累加计算各阶乘的和
            ++i;
            factorial=factorial.multiply(new BigDecimal(1.0/i));//计算阶乘项
        }
        System.out.println("sum====="+sum);//输出
    }
}
