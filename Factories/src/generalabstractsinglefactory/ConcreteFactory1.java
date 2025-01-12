package generalabstractsinglefactory;

class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ConcreteClass1 create() {
        return new ConcreteClass1();
    }

}
