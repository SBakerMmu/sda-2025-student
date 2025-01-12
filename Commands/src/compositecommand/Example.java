package compositecommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public final class Example {

    public static void run() {
        System.out.printf("Composite%n");
        MyClass anInstanceOfMyClass = new MyClass();
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        Command add3 = new AddCommand(anInstanceOfMyClass, 3);
        Command add4 = new AddCommand(anInstanceOfMyClass, 4);
        Command add5 = new AddCommand(anInstanceOfMyClass, 5);

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(add3);
        compositeCommand.add(add4);
        compositeCommand.add(add5);

        compositeCommand.execute();
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
        compositeCommand.undo();
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
    }
}

