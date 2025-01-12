package generalbridge;

class RefinedAbstraction1 extends Abstraction {
    public RefinedAbstraction1(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        //Do something specific to RefinedAbstraction1
        implementor.operationImplementation();

    }
}
