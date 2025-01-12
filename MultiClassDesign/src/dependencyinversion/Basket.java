package dependencyinversion;

class Basket {

    final AbstractCreditCardService creditCardService;

    public Basket(AbstractCreditCardService creditCardService) {

        this.creditCardService = creditCardService;
    }

    double getTotal() {
        //Get sum total of goods, tax and delivery
        return 100.0d;
    }

    public void chargeCreditCard(String cardNumber, int expiryYear, int expiryMonth) {
        creditCardService.takePayment(getTotal(), cardNumber, expiryYear, expiryMonth);
    }
}
