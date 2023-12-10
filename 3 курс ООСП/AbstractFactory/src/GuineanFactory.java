public class GuineanFactory implements PizzaFactory{
    @Override
    public Spicy createSpicy() {
        return new GuineanSpicy();
    }

    @Override
    public Sweet createSweet() {
        return new GuineanSweet();
    }
}
