package dependencyinversion;

import java.time.LocalDateTime;

class RealCreditCardService implements AbstractCreditCardService {

    public RealCreditCardService() {
    }

    public void takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth) {

        LocalDateTime now = LocalDateTime.now();
        if (expiryYear > now.getYear() || (expiryYear == now.getYear() && expiryMonth >= now.getMonthValue())) {

            // Actually charge card through integration with payment processor
        }
    }
}
