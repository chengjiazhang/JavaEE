package Interface;

import java.util.Arrays;

/**
 * @author: ZCJ
 * @Date: 2019-10-31 10:00
 * @Description:策略设计模式
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorret";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }


}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Downcase extends Processor {
    @Override
    String process(Object input) {
        return (((String) input).toLowerCase());
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
