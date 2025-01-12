package factorymethod;


public class Example {

    public static void run()
    {
        ExpensiveObjectSingletonFactory factory = new ExpensiveFileObjectSingletonFactory();
        showOperations(factory);
        factory = new ExpensiveDatabaseObjectSingletonFactory();
        showOperations(factory);
    }

    private static void showOperations(ExpensiveObjectSingletonFactory factory) {
        AbstractExpensiveObject expensiveObject = factory.create();
        System.out.format("%s%n", expensiveObject);

    }
}
