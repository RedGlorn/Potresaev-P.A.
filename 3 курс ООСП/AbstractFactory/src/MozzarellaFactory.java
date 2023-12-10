public class MozzarellaFactory implements PizzaFactory{
    @Override
    public Spicy createSpicy() {
        return new MozzarellaSpicy();
    }

    @Override
    public Sweet createSweet() {
        return new MozzarellaSweet();
    }
}
