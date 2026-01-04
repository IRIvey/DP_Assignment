public class CoffeeOrderProcessor extends OrderProcessor {
    private BeverageFactory factory;

    public CoffeeOrderProcessor() {
        this.factory = new CoffeeFactory();
    }

    @Override
    protected Beverage prepareBeverage() {
        System.out.println("Preparing Coffee...");
        Beverage beverage = factory.createBeverage();


        beverage = new MilkDecorator(beverage);
        beverage = new SugarDecorator(beverage);

        return beverage;
    }
}
