import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String login = "Pavel";
        String password = "12345";
        String log, par;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите логин и пароль");
        System.out.print("логин: ");
        log = scan.nextLine();
        System.out.print("пароль: ");
        par = scan.nextLine();

        if(log.equals(login) && par.equals(password))
            System.out.println("Вас узнали Добро пожаловать!");
        else
            System.out.println("Логин и пароль не распознаны Доступ запрещен");
    }
}

// Ввести в качестве параметров имя пользователя и пароль. Проверить совпадение с
// с введёнными заранее значениями и вывести "Вас узнали. Добро пожаловать" при совпадении
// и "Логин и пароль не распознаны" при несовпадении