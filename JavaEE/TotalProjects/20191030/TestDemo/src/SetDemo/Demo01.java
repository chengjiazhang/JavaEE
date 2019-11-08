package SetDemo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 14:46
 * @Description:HashSet 与TreeSet
 */
public class Demo01 {
    public static void main(String[] args) {
        Random rand1 = new Random(47);
        Set<String> intest1 = new HashSet<>();
        intest1.add("11");
        intest1.add("90");
        intest1.add("100");
        System.out.println("HashSet====" + intest1);


        Random rand2 = new Random(47);
        Set<Integer> intest2 = new TreeSet<>();
        for (int i = 0; i < 1000; i++)
            intest2.add(rand2.nextInt(30));
        System.out.println("TreeSet===" + intest2);


    }

}
