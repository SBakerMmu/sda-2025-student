package orderstatemachine;

class DummyPaymentService implements PaymentService {

    @Override
    public void refundCustomer(String orderNumber) {
        System.out.printf("Payment: refund for order number %s.%n", orderNumber);
    }
}
