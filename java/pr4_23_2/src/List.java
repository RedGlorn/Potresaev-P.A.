import java.util.ArrayList;


public class List {
    public static void main(String[] args) {
        ArrayList<Stomatology> fileOfStomatology = new ArrayList<>();
        Main stomat = new Main(fileOfStomatology);

        String Name = "Областная больница";
        String Adress = "Улица 13";
        String City = "Белонебо";
        int NumOfDocs = 66;

//        Stomatology st1 = new Stomatology(Name, Adress,City,NumOfDocs);
//        stomat.NewStomatology(st1);

        String BrName = "Немедленного выезда";
        int Floor = 1;
        String FIOM = "Петров Игроь Васильевич";

        Branch br1 = new Branch(Name,Adress,City,NumOfDocs,BrName,Floor,FIOM);
        stomat.NewStomatology(br1);

        String BreName = "Немедленного выезда";
        String DFIO = "Несевенко Всеслав Матвеенко";
        String Post = "Руководящий";
        String ScTitle = "Главный врач";
        int WE = 10 ;

        Doctors dc1 = new Doctors(Name,Adress,City,NumOfDocs,BreName,DFIO,Post,ScTitle,WE);
        stomat.NewStomatology(dc1);

        String PFIO = "Неданов Богдан Алексеевич";
        int Npol = 339666;
        String Date = "13.05.20";
        String Work = "Замена зубов";
        int Sum = 30500;
        String DoFIO = "Молодцо Алексей Васильевич";



        System.out.println(stomat.SeeStomatology());
    }
}
