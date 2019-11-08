package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 15:18
 * @Description:
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }


}
