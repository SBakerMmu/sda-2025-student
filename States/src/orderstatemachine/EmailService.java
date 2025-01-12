package orderstatemachine;

interface EmailService {
    void sendOrderConfirmation(String orderNumber);

    void sendCustomerCancellationConfirmationEmail(String orderNumber);

    void sendWarehouseCancellationApologyEmail(String orderNumber);

    void notifyCourier(String orderNumber);

    void sendDispatchConfirmationEmail(String orderNumber);

    void sendReturnConfirmationEmail(String orderNumber);
}
