package generalmediator;

class ConcreteColleague2 implements Colleague {

    private final Mediator mediator;

    ConcreteColleague2(Mediator mediator) {
        this.mediator = mediator;
    }

    void notify(String s) {
        System.out.format("ConcreteColleague2 notified %s%n", s);
    }

    void send(String s) {
        mediator.send(s, this);
    }
}
