package expensiveobjectsingleton;

class ExpensiveObject {

    private final String source;

    ExpensiveObject(String source)
    {
        this.source = source;
    }

    @Override
    public String toString() {
        return String.format("ExpensiveObject %s", source);
    }
}
