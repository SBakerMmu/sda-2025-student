package countdown;

class Counting implements State {

  private  int count;

  public Counting(int count) {
    this.count = count;
  }

  @Override
  public void start(Context context) {

  }

  @Override
  public void stop(Context context) {
    context.setState(new Stopped(count));
  }

  @Override
  public void tick(Context context) {
    if(--count == 0)
    {
      context.setState(new Triggered());
    }
  }

  @Override
  public int getCount() {
    return count;
  }
}
