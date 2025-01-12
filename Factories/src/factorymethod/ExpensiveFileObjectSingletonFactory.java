package factorymethod;

class ExpensiveFileObjectSingletonFactory extends ExpensiveObjectSingletonFactory {
    @Override
    protected AbstractExpensiveObject doCreate() {
        return new ExpensiveFileObject();
    }
}
