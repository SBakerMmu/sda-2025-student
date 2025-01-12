package generaladaptor;

class Adapter implements Target {

    final Adaptee adaptee;

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operation() {
        //do whatever is necessary to convert the operation() call to a call to operation2() on the adaptee interface
        adaptee.operation2();
    }
}


