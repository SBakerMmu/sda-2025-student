package countdown;

interface State {
  void start(Context context);
  void stop(Context context);
  void tick(Context context);
  int getCount();
}
