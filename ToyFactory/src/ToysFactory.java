public class ToysFactory implements ToysFactoryInterface {
    @Override
    public ToysInterface create(ToyTypes toyTypes) {

        switch (toyTypes) {
            case BALL -> {
                System.out.println("��� �����");
                return new Ball();
            }
            case DOLL -> {
                System.out.println("����� ������� ������� ����");
                return new Doll();
            }
            case PUZZLE -> {
                System.out.println("����� ��������");
                return new Puzzle();
            }
            default -> {
                System.out.println("����� ������� ���");
                return null;
            }
        }
    }

}