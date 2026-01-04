public class CoffeeShopDemo {
    public static void main(String[] args) {
        System.out.println("Coffee Shop Order System\n");


        System.out.println("Order 1: Coffee");
        OrderProcessor coffeeOrder = new CoffeeOrderProcessor();
        coffeeOrder.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        coffeeOrder.processOrder();

        System.out.println("\n");


        System.out.println("Order 2: Tea");
        OrderProcessor teaOrder = new TeaOrderProcessor();
        teaOrder.setPaymentStrategy(new CashPayment());
        teaOrder.processOrder();

        System.out.println("\n");


        System.out.println("Order 3: Smoothie");
        OrderProcessor smoothieOrder = new SmoothieOrderProcessor();
        smoothieOrder.setPaymentStrategy(new MobilePayment("+1234567890"));
        smoothieOrder.processOrder();

        System.out.println("\nAll Orders Completed");
    }
}