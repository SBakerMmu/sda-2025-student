package extendedstatemachine;

interface State {
    void tick(Context context);

    void reset(Context context);
}
