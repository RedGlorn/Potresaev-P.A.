import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String login = "Pavel";
        String password = "12345";
        String log, par;
        Scanner scan = new Scanner(System.in);

        System.out.println("������� ����� � ������");
        System.out.print("�����: ");
        log = scan.nextLine();
        System.out.print("������: ");
        par = scan.nextLine();

        if(log.equals(login) && par.equals(password))
            System.out.println("��� ������ ����� ����������!");
        else
            System.out.println("����� � ������ �� ���������� ������ ��������");
    }
}

// ������ � �������� ���������� ��� ������������ � ������. ��������� ���������� �
// � ��������� ������� ���������� � ������� "��� ������. ����� ����������" ��� ����������
// � "����� � ������ �� ����������" ��� ������������