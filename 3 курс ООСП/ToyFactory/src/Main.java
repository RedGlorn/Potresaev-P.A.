public class Main {
    public static void main(String[] args) {
        ToysFactory toysFactory = new ToysFactory();
        toysFactory.create(ToyTypes.BALL);
        toysFactory.create(ToyTypes.DOLL);
        toysFactory.create(ToyTypes.PUZZLE);
    }
}