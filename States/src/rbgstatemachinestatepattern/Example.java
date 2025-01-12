package rbgstatemachinestatepattern;


public final class Example {

    public static void run() {
        System.out.printf("Two Event Machine using State Pattern%n");
        MultipleEventStateMachine multipleEventStateMachine = new MultipleEventStateMachine();
        multipleEventStateMachine.forward();
        multipleEventStateMachine.forward();
        multipleEventStateMachine.forward();
        multipleEventStateMachine.reverse();
        multipleEventStateMachine.reverse();
        multipleEventStateMachine.reverse();
    }
}
