public class SmoothieFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Smoothie();
    }
}