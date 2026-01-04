public abstract class OrderProcessor {
    private PaymentStrategy paymentStrategy;


    public final void processOrder() {
        validateOrder();
        Beverage beverage = prepareBeverage();
        double totalCost = calculateCost(beverage);
        processPayment(totalCost);
        serveBeverage();
    }


    private void validateOrder() {
        System.out.println("Validating order...");
    }


    protected abstract Beverage prepareBeverage();


    private double calculateCost(Beverage beverage) {
        double cost = beverage.getCost();
        System.out.println("Order: " + beverage.getDescription());
        System.out.println("Total Cost: " + cost);
        return cost;
    }


    private void processPayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment method selected!");
        }
    }


    private void serveBeverage() {
        System.out.println("Serving beverage. Enjoy!");
    }


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}