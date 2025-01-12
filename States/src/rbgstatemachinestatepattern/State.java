package rbgstatemachinestatepattern;

interface State {
    void forward(Context context);

    void reverse(Context context);
}
