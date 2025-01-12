package generaltemplatemethod;

class ConcreteClass2 extends AbstractClass{
    @Override
    protected void operation1() {
        System.out.format("%s%n", "ConcreteClass2 operation1");
    }

    @Override
    protected void operation2() {
        System.out.format("%s%n", "ConcreteClass2 operation2");
    }
}
