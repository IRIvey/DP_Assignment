public class TeaOrderProcessor extends OrderProcessor {
    private BeverageFactory factory;

    public TeaOrderProcessor() {
        this.factory = new TeaFactory();
    }

    @Override
    protected Beverage prepareBeverage() {
        System.out.println("Preparing Tea...");
        Beverage beverage = factory.createBeverage();


        beverage = new SugarDecorator(beverage);

        return beverage;
    }
}