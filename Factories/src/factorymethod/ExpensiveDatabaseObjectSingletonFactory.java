package factorymethod;

class ExpensiveDatabaseObjectSingletonFactory extends  ExpensiveObjectSingletonFactory{
    @Override
    protected AbstractExpensiveObject doCreate() {
        return new ExpensiveDatabaseObject();
    }
}
