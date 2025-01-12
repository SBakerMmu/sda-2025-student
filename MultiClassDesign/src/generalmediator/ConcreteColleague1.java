package generalmediator;

class ConcreteColleague1 implements Colleague {

    private final Mediator mediator;

    ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    void notify(String s) {
        //Receive a notification from Mediator
        System.out.format("ConcreteColleague1 notified %s%n", s);
    }

    void send(String s) {
        mediator.send(s, this);
    }
}
