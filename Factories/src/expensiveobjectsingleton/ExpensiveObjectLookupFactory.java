package expensiveobjectsingleton;

class ExpensiveObjectLookupFactory implements ExpensiveObjectAbstractFactory{
    @Override
    public ExpensiveObject create() {
        //look up data from database or file every time
        return new ExpensiveObject("Lookup every time");
    }

}
