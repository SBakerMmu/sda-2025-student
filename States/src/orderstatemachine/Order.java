package orderstatemachine;

class Order {

    private final String orderNumber;
    private final int orderItems;
    private final EmailService emailService;
    private final PaymentService paymentService;
    private State currentState = new Received();

    Order(String orderNumber, int orderItems, EmailService emailService, PaymentService paymentService) {
        this.orderNumber = orderNumber;
        this.orderItems = orderItems;
        this.emailService = emailService;
        this.paymentService = paymentService;
    }

    void paymentConfirmed() {
        currentState.paymentConfirmed();
    }

    void customerCancelled() {
        currentState.customerCancelled();
    }

    void warehouseCancelled() {
        currentState.warehouseCancelled();
    }

    void itemPicked() {
        currentState.itemPicked();
    }

    void orderPacked() {
        currentState.orderPacked();
    }

    void courierPickup() {
        currentState.courierPickup();
    }

    void customerReturn() {
        currentState.customerReturn();
    }

    public String getCurrentState() {
        return String.format("%s %s", orderNumber, currentState);
    }

    private interface State {
        void paymentConfirmed();

        void customerCancelled();

        void warehouseCancelled();

        void itemPicked();

        void orderPacked();

        void courierPickup();

        void customerReturn();
    }

    private abstract static class AbstractState implements State {
        @Override
        public void paymentConfirmed() {
            throw new IllegalStateException();
        }

        @Override
        public void customerCancelled() {
            throw new IllegalStateException();
        }

        @Override
        public void warehouseCancelled() {
            throw new IllegalStateException();
        }

        @Override
        public void itemPicked() {
            throw new IllegalStateException();
        }

        @Override
        public void orderPacked() {
            throw new IllegalStateException();
        }

        @Override
        public void courierPickup() {
            throw new IllegalStateException();
        }

        @Override
        public void customerReturn() {
            throw new IllegalStateException();
        }
    }

    private static class Returned extends AbstractState {

        @Override
        public String toString() {
            return "Returned";
        }

        //There are no legal transitions from Returned state, it is the final state
    }

    private static class Cancelled extends AbstractState {

        @Override
        public String toString() {
            return "Cancelled";
        }

        //There are no legal transitions from Cancelled state, it is the final state
    }

    private class Received extends AbstractState {

        @Override
        public String toString() {
            return "Received";
        }


        @Override
        public void paymentConfirmed() {
            emailService.sendOrderConfirmation(orderNumber);
            currentState = new Paid();
        }

        @Override
        public void customerCancelled() {
            paymentService.refundCustomer(orderNumber);
            emailService.sendCustomerCancellationConfirmationEmail(orderNumber);
            currentState = new Cancelled();
        }

    }

    private class Paid extends AbstractState {

        private int itemsToPick = orderItems;

        @Override
        public String toString() {
            return "Paid";
        }

        @Override
        public void itemPicked() {
            if (--itemsToPick == 0) {
                currentState = new Picked();
            }
        }

        @Override
        public void customerCancelled() {
            itemsToPick = orderItems;
            paymentService.refundCustomer(orderNumber);
            emailService.sendCustomerCancellationConfirmationEmail(orderNumber);
            currentState = new Cancelled();
        }

        @Override
        public void warehouseCancelled() {
            itemsToPick = orderItems;
            paymentService.refundCustomer(orderNumber);
            emailService.sendWarehouseCancellationApologyEmail(orderNumber);
            currentState = new Cancelled();
        }
    }

    private class Picked extends AbstractState {

        @Override
        public String toString() {
            return "Picked";
        }

        @Override
        public void orderPacked() {
            emailService.notifyCourier(orderNumber);
            currentState = new Packed();
        }

        @Override
        public void warehouseCancelled() {
            paymentService.refundCustomer(orderNumber);
            emailService.sendWarehouseCancellationApologyEmail(orderNumber);
            currentState = new Cancelled();
        }
    }

    private class Packed extends AbstractState {

        @Override
        public String toString() {
            return "Packed";
        }

        @Override
        public void courierPickup() {
            emailService.sendDispatchConfirmationEmail(orderNumber);
            currentState = new Dispatched();
        }

    }

    private class Dispatched extends AbstractState {

        @Override
        public String toString() {
            return "Dispatched";
        }

        @Override
        public void customerReturn() {
            paymentService.refundCustomer(orderNumber);
            emailService.sendReturnConfirmationEmail(orderNumber);
            currentState = new Returned();
        }
    }
}
