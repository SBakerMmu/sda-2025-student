package compositemenu;

import java.util.ArrayList;
import java.util.List;

class CompositeMenuItem extends AbstractMenuItem {

    private final List<MenuItem> items = new ArrayList<>();

    CompositeMenuItem(String name) {
        this(null, name);
    }

    CompositeMenuItem(CompositeMenuItem parent, String name) {
        super(parent, name);
    }

    @Override
    public void display() {
        System.out.printf("%s%s >%n", indent(), name);
        for (MenuItem item : items) {
            item.display();
        }
    }

    public void add(MenuItem newItem) {
        items.add(newItem);
    }
}
