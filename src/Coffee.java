public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}