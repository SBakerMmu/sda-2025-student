package countdown;

class Clock implements Context {

  private State currentState;

  public Clock(int count) {
    currentState = new Stopped(count);
  }

  public void start() {
    currentState.start(this);
  }

  public void stop() {
    currentState.stop(this);
  }

  public void tick() {
    currentState.tick(this);
  }

  public int getCount() {
    return currentState.getCount();
  }
  @Override
  public void setState(State newState) {
    currentState = newState;
  }

  @Override
  public State getCurrentState() {
    return currentState;
  }
}
