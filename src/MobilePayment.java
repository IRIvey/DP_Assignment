public class MobilePayment implements PaymentStrategy {
    private String phoneNumber;

    public MobilePayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Mobile Payment: " + phoneNumber);
    }
}
