package orderstatemachine;


public final class Example {

    public static void run() {
        System.out.printf("Order State Machine %n");

        EmailService emailService = new DummyEmailService();
        PaymentService paymentService = new DummyPaymentService();
        Order order = new Order("10001234", 3, emailService, paymentService);
        System.out.printf("%s%n", order.getCurrentState());
        order.paymentConfirmed();
        System.out.printf("%s%n", order.getCurrentState());
        order.itemPicked();
        System.out.printf("%s%n", order.getCurrentState());
        order.itemPicked();
        System.out.printf("%s%n", order.getCurrentState());
        order.itemPicked();
        System.out.printf("%s%n", order.getCurrentState());
        order.orderPacked();
        System.out.printf("%s%n", order.getCurrentState());
        order.courierPickup();
        System.out.printf("%s%n", order.getCurrentState());
        order.customerReturn();
        System.out.printf("%s%n", order.getCurrentState());

        order = new Order("10001235", 1, emailService, paymentService);

        System.out.printf("%s%n", order.getCurrentState());
        order.paymentConfirmed();
        System.out.printf("%s%n", order.getCurrentState());
        order.warehouseCancelled();
        System.out.printf("%s%n", order.getCurrentState());
    }
}
