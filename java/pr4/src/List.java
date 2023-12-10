import java.util.ArrayList;


public class List {
    public static void main(String[] args) {
        ArrayList<Stomatology> fileOfStomatology = new ArrayList<>();
        Main stomat = new Main(fileOfStomatology);

        String Name = "Областная больница";
        String Adress = "Улица 13";
        String City = "Белонебо";
        int NumOfDocs = 66;

        Stomatology st1 = new Stomatology(Name, Adress,City,NumOfDocs);
        stomat.NewStomatology(st1);

        String BrName = "Немедленного выезда";
        int Floor = 1;
        String FIOM = "Петров Игроь Васильевич";

        Branch br1 = new Branch(Name,Adress,City,NumOfDocs,BrName,Floor,FIOM);
        stomat.NewStomatology(br1);

        String DFIO = "Несевенко Всеслав Матвеенко";
        String Post = "Руководящий";
        String ScTitle = "Главный врач";
        int WE = 10;

        Doctors dc1 = new Doctors(Name,Adress,City,NumOfDocs,BrName,DFIO,Post,ScTitle,WE);
        stomat.NewStomatology(dc1);

        String PFIO = "Неданов Богдан Алексеевич";
        int Npol = 339666;
        String Date = "13.05.20";
        String Work = "Общий осмотр";
        int Sum = 30500;
        String DoFIO = "Молодцо Алексей Васильевич";

        History hs1 = new History(Name,Adress,City,NumOfDocs,PFIO,Npol,Date,Work,Sum,DoFIO);
        stomat.NewStomatology(hs1);

//n2
        String Name2 = "Городской оздоровительный центр";
        String Adress2 = "Переулок Весёлый 10А";
        String City2 = "Белонебо";
        int NumOfDocs2= 23;

        Stomatology st2 = new Stomatology(Name2, Adress2,City,NumOfDocs2);
        stomat.NewStomatology(st2);

        String BrName2 = "Неотложной помощи";
        int Floor2 = 1;
        String FIOM2 = "Щетко Валерий Леонидович";
        String BrName2_1 = "Стоматология";
        int Floor2_1 = 2;
        String FIOM2_1 = "Лёгкий Артём Евгеньевич";

        Branch br2 = new Branch(Name2,Adress2,City2,NumOfDocs2,BrName2,Floor2,FIOM2);
        stomat.NewStomatology(br2);
        Branch br2_1 = new Branch(Name2,Adress2,City2,NumOfDocs2,BrName2_1,Floor2_1,FIOM2_1);
        stomat.NewStomatology(br2_1);

        String DFIO2 = "Несевенко Всеслав Матвеенко";
        String Post2 = "Руководящий";
        String ScTitle2 = "Главный врач";
        int WE2 = 10;
        String DFIO2_1 = "Петров Пётр Петрович";
        String Post2_1 = "Вахтёр";
        String ScTitle2_1 = "Помощник врача";
        int WE2_1 = 5;

        Doctors dc2 = new Doctors(Name2,Adress2,City,NumOfDocs2,BrName2,DFIO2,Post2,ScTitle2,WE2);
        stomat.NewStomatology(dc2);
        Doctors dc2_1 = new Doctors(Name2,Adress2,City,NumOfDocs2,BrName2_1,DFIO2_1,Post2_1,ScTitle2_1,WE2_1);
        stomat.NewStomatology(dc2_1);

        String PFIO2 = "Зощенко Никита Алексеевич";
        int Npol2 = 369688;
        String Date2 = "13.05.03";
        String Work2 = "Замена зубов";
        int Sum2 = 30500;
        String DoFIO2 = "Зощенко Никита Алексеевич";

        History hs2 = new History(Name2,Adress2,City,NumOfDocs2,PFIO2,Npol2,Date2,Work2,Sum2,DoFIO2);
        stomat.NewStomatology(hs2);


        System.out.println(stomat.SeeStomatology());
    }
}
