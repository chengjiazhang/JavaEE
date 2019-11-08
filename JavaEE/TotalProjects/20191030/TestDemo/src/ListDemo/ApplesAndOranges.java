package ListDemo;

import java.util.ArrayList;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 13:21
 * @Description:ArrayList使用泛型
 */

public class ApplesAndOranges {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }
        for(int i=0;i<apples.size();i++){
            System.out.println(apples.get(i).id());
        }

        for(Apple c:apples){
            System.out.println(c.id());
        }
    }

}

class Apple{
    private static long counter;
    private final long id=counter++;
    public  long id(){
        return id;
    }
}

class Orange{}


