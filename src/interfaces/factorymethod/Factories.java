package interfaces.factorymethod;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
// Пример фабричных методов. Делаем фабрику сервисов

// это то, что будет выпускать наша фабрика, это продукт
interface Service {
    void method1();

    void method2();

}

// а это наша фабрика сервисов
interface ServiceFactory {
    Service getService(); // фабричный метод

    Service getService(String name); // фабричный метод
}

// это первая имплементация "продукта" сервиса
class Implementation1 implements Service {

    String serviceName;

    public Implementation1() {
        serviceName = "NoNaMe1";
    }

    public Implementation1(String name) {
        serviceName = name;
    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }

    public String getName() {
        return serviceName;
    }

}

// это первая имплементация фабрики
class Implementation1Factory implements ServiceFactory {

    String serviceName;

    public Implementation1Factory() {
        serviceName = "NoName1F";
    }

    public Implementation1Factory(String name) {
        serviceName = name;
    }

    // метод возвращающий реальный продукт Service
    @Override
    public Service getService() {
        return new Implementation1(serviceName);
    }

    @Override
    public Service getService(String name) {
        return new Implementation1(name);
    }

}

// это вторая имплементация "продукта" сервиса
class Implementation2 implements Service {

    String serviceName;

    public Implementation2() {
        serviceName = "NoNaMe2";
    }

    public Implementation2(String name) {
        serviceName = name;
    }

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }

    public String getName() {
        return serviceName;
    }

}

// это вторая имплементация фабрики
class Implementation2Factory implements ServiceFactory {

    String serviceName;

    public Implementation2Factory() {
        serviceName = "NoName2F";
    }

    public Implementation2Factory(String name) {
        serviceName = name;
    }

    // метод возвращающий реальный продукт Service
    @Override
    public Service getService() {
        return new Implementation2(serviceName);
    }

    @Override
    public Service getService(String name) {
        return new Implementation2(name);
    }

}

public class Factories {

    public static void main(String[] args) {

        // выпускаем наши сервисы с помощью разных фабрик
        serviceConsumer(new Implementation1Factory("Service1"));
        System.out.println();
        serviceConsumer(new Implementation2Factory("Service2"));

    }

    static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();

        if (s instanceof Implementation1) {
            Implementation1 i1 = (Implementation1) s;
            System.out.println(i1.getName());
        }

        if (s instanceof Implementation2) {
            Implementation2 i2 = (Implementation2) s;
            System.out.println(i2.getName());
        }

    }

}