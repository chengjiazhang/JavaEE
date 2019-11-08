package ListDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 13:34
 * @Description:
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples
        ) {
            System.out.println(c);
        }
    }


}

class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}

