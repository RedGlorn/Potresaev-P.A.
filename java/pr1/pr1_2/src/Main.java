import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n=0;
        Scanner par = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            String per = par.nextLine();
            if (per.equals("")) ;
            else
                n +=1;
        }
        if (n>0) System.out.println("Вы передали "+ n +" параметров");
        else System.out.println("Вы не передали параметры");
    }
}

//Написать программу получающую на вход в качестве агрументов несколько параметров.
//Вывести "Вы ввели N параметров" или "Вы не передавали параметры" если параметров не было передано.