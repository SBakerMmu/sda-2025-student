package factorymethod;

abstract class ExpensiveObjectSingletonFactory {

    private AbstractExpensiveObject cachedInstance = null;

    public AbstractExpensiveObject create()
    {

        if(cachedInstance == null)
        {
            //look up data from database or file
            cachedInstance = doCreate();
        }
        return cachedInstance;

    }
    protected abstract AbstractExpensiveObject doCreate();


}
