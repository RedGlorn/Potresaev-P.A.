import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String N = name.nextLine();
        if (N.equals(""))
           System.out.println("Hello world!");
        else System.out.println("Hello " + N);

    }
}

//Релизовать программу получающую на вход имя человека и выводящую
//"Hello *имя человека* " или "Hello world" если имя не было введено.