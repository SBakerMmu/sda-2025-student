package generalabstractfamilyfactory;

class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ConcreteClass1A createA() {
        return new ConcreteClass1A();
    }

    @Override
    public ConcreteClass1B createB() {
        return new ConcreteClass1B();
    }
}
