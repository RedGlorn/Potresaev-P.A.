import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два значения");
        Scanner par = new Scanner(System.in);
        String fir, sec;
        fir = par.nextLine();
        sec = par.nextLine();
        int res;

        if (fir.equals("") || sec.equals(""))
            System.out.println("Введено неверное количество переменных");
        else
        {
            res = Integer.parseInt(fir)+ Integer.parseInt(sec);
            System.out.println(fir +" + "+ sec +" = "+ res);
        }

    }
}

//Передавать в качестве параметров два целочисленных числа.
// Вывести на экран значиния и их сумму. Если параметров не 2 вывести " неверное количество параметров".