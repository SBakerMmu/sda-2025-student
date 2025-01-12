package dependencyinversion;

import java.time.LocalDateTime;

public final class Example {

    public static void run() {
        AbstractCreditCardService testService = new FailingCreditCardService();
        Basket basket = new Basket(testService);
        //put things in basket
        basket.chargeCreditCard(" 4111 1111 1111 1111", 2028, 12);

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.format("Current time: %s%n", currentTime);
    }

}
