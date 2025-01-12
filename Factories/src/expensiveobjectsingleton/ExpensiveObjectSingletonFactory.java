package expensiveobjectsingleton;

class ExpensiveObjectSingletonFactory implements ExpensiveObjectAbstractFactory {

    private ExpensiveObject cachedInstance = null;

    //Note this is not thread safe, but exists to show the general pattern
    public ExpensiveObject create() {

        if (cachedInstance == null) {
            //look up data from database or file once
            cachedInstance = new ExpensiveObject("Cached Singleton");
        }
        return cachedInstance;

    }
}
