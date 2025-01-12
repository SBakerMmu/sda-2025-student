package dependencyinversion;

class FailingCreditCardService implements AbstractCreditCardService {

    @Override
    public void takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
        //simulate a failed attempt to take payment
    }
}
