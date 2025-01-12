package multiobserver;

import java.util.ArrayList;
import java.util.List;

class MyClass {

    final List<MyClassObserver> observers = new ArrayList<>();

    void addObserver(MyClassObserver observer) {
        observers.add(observer);
    }


    void myOperation(String operationParameter) {
        //do the operation
        //notify the observers
        for (MyClassObserver observer : observers) {
            observer.onOperationCalled(operationParameter);
        }
    }
}
