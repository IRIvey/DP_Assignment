public class SmoothieOrderProcessor extends OrderProcessor {
    private BeverageFactory factory;

    public SmoothieOrderProcessor() {
        this.factory = new SmoothieFactory();
    }

    @Override
    protected Beverage prepareBeverage() {
        System.out.println("Preparing Smoothie...");
        Beverage beverage = factory.createBeverage();


        beverage = new WhippedCreamDecorator(beverage);

        return beverage;
    }
}