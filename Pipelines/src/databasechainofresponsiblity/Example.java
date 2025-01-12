package databasechainofresponsiblity;

public final class Example {

    public static void run() {
        SearchHandler handler = new DatabaseHandler(new DefaultHandler());
        handler.hasDigitalObject("10.1000/182");
    }

}
