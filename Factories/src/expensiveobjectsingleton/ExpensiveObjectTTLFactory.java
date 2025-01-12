package expensiveobjectsingleton;

import java.util.Date;

class ExpensiveObjectTTLFactory implements ExpensiveObjectAbstractFactory{

    private ExpensiveObject cachedInstance = null;
    private final long ttl  = 1000; //TTL is 1 second
    private long createdTime = 0; //Time that the cachedInstance was created


    //As before there are thread safety issues with this code
    public ExpensiveObject create()
    {
        long now = System.currentTimeMillis();
        if((cachedInstance == null) || ((now - createdTime) > ttl))
        {
            //set the time the instance was created
            createdTime = now;

            //look up data from database or file
            cachedInstance = new ExpensiveObject(String.format("Created %d with TTL %d", createdTime, ttl));
        }
        return cachedInstance;
    }
}
