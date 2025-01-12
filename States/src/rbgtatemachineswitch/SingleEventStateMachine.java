package rbgtatemachineswitch;

class SingleEventStateMachine {

    private State currentState = State.Red; //Start in Red state as the initial state

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
}

