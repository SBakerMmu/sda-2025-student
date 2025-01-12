package expensiveobjectsingleton;

import generalabstractfamilyfactory.*;

public class Example {

    public static void run()
    {
        ExpensiveObjectAbstractFactory factory = new ExpensiveObjectLookupFactory();
        showOperations(factory);
        factory = new ExpensiveObjectSingletonFactory();
        showOperations(factory);
        factory = new ExpensiveObjectTTLFactory();
        showOperations(factory);
    }

    private static void showOperations(ExpensiveObjectAbstractFactory factory) {
        ExpensiveObject expensiveObject = factory.create();
        System.out.format("%s%n", expensiveObject);

    }
}
