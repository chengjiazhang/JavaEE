import Interface.Apply;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

/**
 * @author: ZCJ
 * @Date: 2019-10-31 10:28
 * @Description:
 */
public class Apply02 {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process(s));
    }

}

interface Processor {
    String name();

    Object process(Object input);
}

abstract class StringProcessor implements Processor {

    @Override
    public String name(){
        return getClass().getSimpleName();
    }

    public static String s = "Disagreement with beliefs is by definition incorret";
    public static void main(String[] args) {
        Apply02.process(new Upcase(), s);
        Apply02.process(new Downcase(), s);
        Apply02.process(new Splitter(), s);
    }
}

class Upcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Downcase extends StringProcessor {
   @Override
   public  String process(Object input) {
        return (((String) input).toLowerCase());
    }
}

class Splitter extends StringProcessor {
    @Override
   public  String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
