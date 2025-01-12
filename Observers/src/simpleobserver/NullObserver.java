package simpleobserver;

class NullObserver implements MyClassObserver {
    @Override
    public void onOperationCalled(String parameter) {
        //do nothing
    }
}
