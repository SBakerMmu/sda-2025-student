package simpleobserver;

class MyClass {

    final MyClassObserver observer;

    MyClass(MyClassObserver observer) {
        this.observer = observer;
    }

    void myOperation(String operationParameter) {
        //do the operation
        //notify the observer
        observer.onOperationCalled(operationParameter);
    }
}
