package generalbridge;

class RefinedAbstraction2 extends Abstraction {
    public RefinedAbstraction2(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        //Do something specific to RefinedAbstraction2
        implementor.operationImplementation();
    }
}
