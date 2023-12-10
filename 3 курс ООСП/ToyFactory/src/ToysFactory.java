public class ToysFactory implements ToysFactoryInterface {
    @Override
    public ToysInterface create(ToyTypes toyTypes) {

        switch (toyTypes) {
            case BALL -> {
                System.out.println("Мяч надут");
                return new Ball();
            }
            case DOLL -> {
                System.out.println("Кукла шевелит частями тела");
                return new Doll();
            }
            case PUZZLE -> {
                System.out.println("Паззл разобран");
                return new Puzzle();
            }
            default -> {
                System.out.println("Таких игрушек нет");
                return null;
            }
        }
    }

}