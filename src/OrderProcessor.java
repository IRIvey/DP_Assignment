// Template Pattern - Abstract Class
public abstract class OrderProcessor {
    private PaymentStrategy paymentStrategy;

    // Template Method - defines the skeleton of the algorithm
    public final void processOrder() {
        validateOrder();
        Beverage beverage = prepareBeverage();
        double totalCost = calculateCost(beverage);
        processPayment(totalCost);
        serveBeverage();
    }

    // Common step
    private void validateOrder() {
        System.out.println("Validating order...");
    }

    // Abstract method - to be implemented by subclasses
    protected abstract Beverage prepareBeverage();

    // Common step
    private double calculateCost(Beverage beverage) {
        double cost = beverage.getCost();
        System.out.println("Order: " + beverage.getDescription());
        System.out.println("Total Cost: $" + cost);
        return cost;
    }

    // Common step using Strategy pattern
    private void processPayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment method selected!");
        }
    }

    // Common step
    private void serveBeverage() {
        System.out.println("Serving beverage. Enjoy!");
    }

    // Setter for payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}