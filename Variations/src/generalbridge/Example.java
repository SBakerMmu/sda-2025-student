package generalbridge;

public final class Example {

    public static void run() {
        Implementor implementation = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction2(implementation);
        abstraction.operation();
    }
}
