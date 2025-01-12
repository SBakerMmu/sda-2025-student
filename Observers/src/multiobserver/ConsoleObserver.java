package multiobserver;

class ConsoleObserver implements MyClassObserver {
    @Override
    public void onOperationCalled(String parameter) {
        System.out.format("myOperation() called with parameter %s\n", parameter);
    }
}
