public class Smoothie implements Beverage {
    @Override
    public String getDescription() {
        return "Smoothie";
    }

    @Override
    public double getCost() {
        return 4.5;
    }
}