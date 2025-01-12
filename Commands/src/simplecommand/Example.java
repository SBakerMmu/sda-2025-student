package simplecommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public final class Example {

    public static void run() {
        single();
        history();
    }

    private static void single() {
        System.out.printf("Single%n");
        MyClass anInstanceOfMyClass = new MyClass();
        Command command = new AddCommand(anInstanceOfMyClass, 2);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
        command.execute();
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
        command.undo();
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
    }


    private static void history() {
        System.out.printf("History%n");
        MyClass anInstanceOfMyClass = new MyClass();
        Stack<Command> history = new Stack<>();

        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        Command add3 = new AddCommand(anInstanceOfMyClass, 3);
        add3.execute();
        history.push(add3);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        Command add4 = new AddCommand(anInstanceOfMyClass, 4);
        add4.execute();
        history.push(add4);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        Command add5 = new AddCommand(anInstanceOfMyClass, 5);
        add5.execute();
        history.push(add5);
        System.out.printf("value %d%n", anInstanceOfMyClass.getValue());

        while (!history.empty()) {
            history.pop().undo();
            System.out.printf("value %d%n", anInstanceOfMyClass.getValue());
        }
    }
}

