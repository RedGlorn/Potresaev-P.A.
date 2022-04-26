import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите два значени€");
        Scanner par = new Scanner(System.in);
        String fir, sec;
        fir = par.nextLine();
        sec = par.nextLine();
        int res;

        if (fir.equals("") || sec.equals(""))
            System.out.println("¬ведено неверное количество переменных");
        else
        {
            res = Integer.parseInt(fir)+ Integer.parseInt(sec);
            System.out.println(fir +" + "+ sec +" = "+ res);
        }

    }
}
