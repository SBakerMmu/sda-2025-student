package orderobserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Order {

    final int tableNumber;
    final List<Pizza> items = new ArrayList<>();
    final List<OrderObserver> observers = new ArrayList<>();

    Order(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void addPizza(Pizza pizza) {
        items.add(pizza);
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public List<Pizza> getItems() {
        return Collections.unmodifiableList(items);
    }

    public double getPrice() {
        return items.stream().mapToDouble(Pizza::getPrice).sum();
    }

    public void save() {
        //save the order to a database
        //notify the Observers that an order has been taken
        for (OrderObserver observer : observers) {
            observer.orderTaken(this);
        }
    }
}
