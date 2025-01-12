package generalabstractsinglefactory;

public class Example {

    public static void run()
    {
        AbstractFactory factory = new ConcreteFactory1();
        showOperations(factory);
        factory = new ConcreteFactory2();
        showOperations(factory);
    }

    private static void showOperations(AbstractFactory factory) {
        AbstractInterface a = factory.create();
        a.operation();
    }
}
