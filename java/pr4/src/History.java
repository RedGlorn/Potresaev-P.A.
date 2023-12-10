public class History extends Stomatology {
    private String PFIO;
    private int NPol;
    private String Date;
    private String Work;
    private int Sum;
    private String DoFIO;

    public History(String Name, String Adress, String City, int NumOfDocs, String PFIO, int Npol, String Date, String Work, int Sum, String DoFIO){
        super(Name, Adress, City, NumOfDocs);
        this.PFIO = PFIO;
        this.NPol = Npol;
        this.Date = Date;
        this.Work = Work;
        this.Sum = Sum;
        this.DoFIO = DoFIO;
    }

    public void setPFIO(String PFIO) {this.PFIO= PFIO;}
    public String getPFIO() {return PFIO;}

    public void setNPol(int NPol) {this.NPol= NPol;}
    public int getNPol() {return NPol;}

    public void setDate(String Date) {this.Date= Date;}
    public String getDate() {return Date;}

    public void setWork(String Work) {this.Work= Work;}
    public String getWork() {return Work;}

    public void setSum(int Sum) {this.Sum= Sum;}
    public int getSum() {return Sum;}

    public void setDFIO(String DFIO) {this.DoFIO= DFIO;}
    public String getDFIO() {return DoFIO;}

    public String toString() {
        return "\u001B[36m\nИстория\u001B[0m "+ "\nФИО пациента: " + PFIO + "\nПолис: " + NPol + "\nДата: " + Date
                + "\nОказанные услуги: " + Work + "\nСумма услуг: " + Sum + "\nФИО врача: " + DoFIO + "\n";
    }
}
