package generalmediator;

class ConcreteMediator implements Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void registerColleagues(ConcreteColleague1 colleague1, ConcreteColleague2 colleague2) {
        this.colleague1 = colleague1;
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String s, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notify(s);
        }
        if (colleague == colleague2) {
            colleague1.notify(s);
        }
    }
}
