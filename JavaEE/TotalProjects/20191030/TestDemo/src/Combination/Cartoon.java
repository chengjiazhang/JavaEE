package Combination;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 16:29
 * @Description:初始化基类
 */
public class Cartoon extends Drawing{
    Cartoon(){
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon=new Cartoon();
    }
}
class Art{
    Art(){
        System.out.println("Art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}
