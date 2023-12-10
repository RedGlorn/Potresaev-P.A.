public class HawaiianFactory implements PizzaFactory{
    @Override
    public Spicy createSpicy() {
        return new HawaiianSpicy();
    }

    @Override
    public Sweet createSweet() {
        return new HawaiianSweet();
    }
}
