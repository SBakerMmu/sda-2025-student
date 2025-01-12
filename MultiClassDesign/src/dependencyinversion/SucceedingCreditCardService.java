package dependencyinversion;

class SucceedingCreditCardService implements AbstractCreditCardService {

    public SucceedingCreditCardService() {
    }

    public void takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {
        //simulates a successful attempt to take payment
    }
}
