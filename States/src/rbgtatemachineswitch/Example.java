package rbgtatemachineswitch;

public final class Example {

    public static void run() {
        System.out.printf("Single Event Machine%n");
        SingleEventStateMachine singleEventStateMachine = new SingleEventStateMachine();
        singleEventStateMachine.forward();
        singleEventStateMachine.forward();
        singleEventStateMachine.forward();
        singleEventStateMachine.forward();

        System.out.printf("Two Event Machine%n");
        MultipleEventStateMachine multipleEventStateMachine = new MultipleEventStateMachine();
        multipleEventStateMachine.forward();
        multipleEventStateMachine.forward();
        multipleEventStateMachine.forward();
        multipleEventStateMachine.reverse();
        multipleEventStateMachine.reverse();
        multipleEventStateMachine.reverse();


    }
}
