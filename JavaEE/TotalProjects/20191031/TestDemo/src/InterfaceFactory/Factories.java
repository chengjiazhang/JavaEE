package InterfaceFactory;

/**
 * @author: ZCJ
 * @Date: 2019-10-31 13:10
 * @Description:工厂
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implemention1Factory());
        serviceConsumer(new Implemention2Factory());

    }


}

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementional1 implements Service {
    Implementional1() {
    }

    @Override
    public void method1() {
        System.out.println("Implementional1 method1");

    }

    @Override
    public void method2() {
        System.out.println("Implementional1 method2");

    }
}

class Implemention1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementional1();
    }
}

class Implementional2 implements Service {
    Implementional2() {

    }

    @Override
    public void method1() {
        System.out.println("Implementional2 method1");

    }

    @Override
    public void method2() {
        System.out.println("Implementional2 method2");

    }

}

class Implemention2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementional2();
    }
}
