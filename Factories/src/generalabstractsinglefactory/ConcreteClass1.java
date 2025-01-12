package generalabstractsinglefactory;

class ConcreteClass1 implements AbstractInterface {
    @Override
    public void operation() {
        System.out.format("%s%n","ConcreteClass1.operation" );
    }
}
