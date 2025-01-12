package generalchainofresponsiblity;

class ConcreteHandler implements Handler {

    private final Handler successor;

    ConcreteHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void operation() {
        //if I can handle the operation, do so, else pass onto my successor
        successor.operation();
    }
}
