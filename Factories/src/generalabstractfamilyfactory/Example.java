package generalabstractfamilyfactory;

public class Example {

    public static void run()
    {
        AbstractFactory factory = new ConcreteFactory1();
        showOperations(factory);
        factory = new ConcreteFactory2();
        showOperations(factory);
    }

    private static void showOperations(AbstractFactory factory) {
        AbstractInterfaceA a = factory.createA();
        a.operationA();
        AbstractInterfaceB b = factory.createB();
        b.operationB();
    }
}
