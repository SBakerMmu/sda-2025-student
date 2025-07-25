package countdown;

public final class Example {

  public static void run()
  {
    Clock clock = new Clock(10);
    showClock(clock);
    clock.start();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.stop();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.start();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
    clock.tick();
    showClock(clock);
  }

  private static void showClock(Clock clock) {
    System.out.format("State is %s Count:%d%n", clock.getCurrentState(), clock.getCount());
  }

}
