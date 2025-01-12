package generalfactorymethod;


public class Example {

    public static void run()
    {
        AbstractCreator creator = new ConcreteCreator1();
        showOperations(creator);
        creator = new ConcreteCreator2();
        showOperations(creator);
    }

    private static void showOperations(AbstractCreator creator) {
        AbstractClass abstractClass = creator.create();
        abstractClass.operation();
    }
}
