package orderstatemachine;

class DummyEmailService implements EmailService {
    @Override
    public void sendOrderConfirmation(String orderNumber) {
        System.out.printf("Email: Thank you for your order number %s.%n", orderNumber);
    }

    @Override
    public void sendCustomerCancellationConfirmationEmail(String orderNumber) {
        System.out.printf("Email: You have cancelled order number %s.%n", orderNumber);
    }

    @Override
    public void sendWarehouseCancellationApologyEmail(String orderNumber) {
        System.out.printf("Email: Sorry, we had to cancel order number %s.%n", orderNumber);
    }

    @Override
    public void notifyCourier(String orderNumber) {
        System.out.printf("Email: Order number %s is ready for collection.%n", orderNumber);
    }

    @Override
    public void sendDispatchConfirmationEmail(String orderNumber) {
        System.out.printf("Email: Your order number %s has been dispatched.%n", orderNumber);
    }

    @Override
    public void sendReturnConfirmationEmail(String orderNumber) {
        System.out.printf("Email: Your return of order number %s has been received.%n", orderNumber);
    }
}
