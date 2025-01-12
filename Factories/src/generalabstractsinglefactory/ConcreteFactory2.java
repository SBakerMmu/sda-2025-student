package generalabstractsinglefactory;

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ConcreteClass2 create() {
        return new ConcreteClass2();
    }
}
