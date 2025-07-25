package countdown;

class Stopped implements State {

  private int count;

  Stopped(int count) {
    this.count = count;
  }

  @Override
  public void start(Context context) {
    context.setState(new Counting(count));
  }

  @Override
  public void stop(Context context) {
    //ignore
  }

  @Override
  public void tick(Context context) {
    //ignore
  }

  @Override
  public int getCount() {
    return count;
  }
}
