package timeadaptor;

public final class Example {

    public static void run() {
        AtomicTimeSource timeSource = new AtomicTimeSource();
        YearMonthProvider provider = new AtomicTimeSourceAdaptor(timeSource);
        provider.getMonth();
        provider.getYear();
    }
}
