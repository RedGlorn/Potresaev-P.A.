import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("������� ��� ��������");
        Scanner par = new Scanner(System.in);
        String fir, sec;
        fir = par.nextLine();
        sec = par.nextLine();
        int res;

        if (fir.equals("") || sec.equals(""))
            System.out.println("������� �������� ���������� ����������");
        else
        {
            res = Integer.parseInt(fir)+ Integer.parseInt(sec);
            System.out.println(fir +" + "+ sec +" = "+ res);
        }

    }
}

//���������� � �������� ���������� ��� ������������� �����.
// ������� �� ����� �������� � �� �����. ���� ���������� �� 2 ������� " �������� ���������� ����������".