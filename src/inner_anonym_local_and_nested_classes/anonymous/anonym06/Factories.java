package inner_anonym_local_and_nested_classes.anonymous.anonym06;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

// это то что выпускает наша фабрика - продукт
interface Service {
    void method1();

    void method2();

    void ServiceName();
}

// это фабрика выпускающая продукт - Service
interface ServiceFactory {
    Service getService();
}

// это первая имплементация продукта - сервиса
class Implementation1 implements Service {
    String serviceName = "NoNameService1";

    Implementation1() {
    }

    Implementation1(String service) {
        serviceName = service;
    }

    public void ServiceName() {
        System.out.println(serviceName);
    }

    public void method1() {
        System.out.println("I1 M1");
    }

    public void method2() {
        System.out.println("I1 M2");
    }

    // первая имплементация фабрики
    public ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1(serviceName);
        }
    };
}

//это вторая имплементация продукта - сервиса
class Implementation2 implements Service {
    String serviceName = "NoNameService2";

    Implementation2() {
    }

    Implementation2(String service) {
        serviceName = service;
    }

    public void ServiceName() {
        System.out.println(serviceName);
    }

    public void method1() {
        System.out.println("I2 M1");
    }

    public void method2() {
        System.out.println("I2 M2");
    }

    // вторая имплементация фабрики
    public ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation2(serviceName);
        }
    };
}

public class Factories {
    static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
        s.ServiceName();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1("Service1").factory);
        System.out.println();
        serviceConsumer(new Implementation2().factory);
    }
}