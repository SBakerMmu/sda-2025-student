package generaltemplatemethod;

class ConcreteClass1 extends AbstractClass{
    @Override
    protected void operation1() {
        System.out.format("%s%n", "ConcreteClass1 operation1");
    }

    @Override
    protected void operation2() {
        System.out.format("%s%n", "ConcreteClass1 operation2");
    }
}
