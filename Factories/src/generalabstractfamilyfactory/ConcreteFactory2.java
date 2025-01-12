package generalabstractfamilyfactory;

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ConcreteClass2A createA() {

        return new ConcreteClass2A();
    }

    @Override
    public ConcreteClass2B createB() {

        return new ConcreteClass2B();
    }
}
