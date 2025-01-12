package generalmediator;

public final class Example {

    public static void run() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.registerColleagues(colleague1, colleague2);

        colleague1.send("Hello from 1");
        colleague2.send("Hello from 2");


    }


}
