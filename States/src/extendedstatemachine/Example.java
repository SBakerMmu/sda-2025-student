package extendedstatemachine;


public final class Example {

    public static void run() {
        System.out.printf("Extended State Machine%n");
        ExtendedStateMachine extendedStateMachine = new ExtendedStateMachine();
        extendedStateMachine.tick();
        extendedStateMachine.tick();
        extendedStateMachine.tick();
        extendedStateMachine.tick();
        extendedStateMachine.tick();
        extendedStateMachine.reset();
        extendedStateMachine.tick();
        extendedStateMachine.reset();
        extendedStateMachine.tick();
    }
}
