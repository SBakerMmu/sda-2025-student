package generalfacade;

public final class Example {

    public static void run() {
        StatefulFacade stateful = new StatefulFacade();
        stateful.methodA();
        stateful.methodB();

        StatelessFacade statelessFacade = new StatelessFacade();
        statelessFacade.methodA();
        statelessFacade.methodB();

        Service service = new ServiceFacade();
        service.methodA();
        service.methodB();

    }
}
