package rbgtatemachineswitch;

class MultipleEventStateMachine {

    private State currentState = State.Red; //Start in Red state

    void forward() {
        switch (currentState) {
            case State.Red: {
                System.out.printf("forward %s -> %s%n", State.Red, State.Blue);
                currentState = State.Blue;
            }
            break;
            case Blue: {
                System.out.printf("forward %s -> %s%n", State.Blue, State.Green);
                currentState = State.Green;
            }
            break;
            case Green: {
                System.out.printf("forward %s -> %s%n", State.Green, State.Red);
                currentState = State.Red;
            }
            break;
            default: {
                //throw exception
            }
            break;
        }
    }

    void reverse() {
        switch (currentState) {
            case State.Red: {
                System.out.printf("reverse %s -> %s%n", State.Red, State.Green);
                currentState = State.Green;
            }
            break;
            case Blue: {
                System.out.printf("reverse %s -> %s%n", State.Blue, State.Red);
                currentState = State.Red;
            }
            break;
            case Green: {
                System.out.printf("reverse %s -> %s%n", State.Green, State.Blue);
                currentState = State.Blue;
            }
            break;
            default: {
                //throw exception
            }
            break;
        }
    }
}
