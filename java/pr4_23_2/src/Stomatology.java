public class Stomatology {
    private String Name;
    private String Adress;
    private String City;
    private int NumOfDocs;

    public Stomatology(String Name, String Adress, String City, int NumOfDocs) {
        this.Name = Name;
        this.Adress = Adress;
        this.City = City;
        this.NumOfDocs = NumOfDocs;
    }

    public void setName(String Name) {this.Name = Name;}
    public String getName() {return Name;}

    public void setAddress(String Adress) {this.Adress = Adress;}
    public String getAddress() {return Adress;}

    public void setCity(String City) {this.City = City;}
    public String getCity() {return City;}

    public void setDocs(int Docs) {this.NumOfDocs = Docs;}
    public int getDocs() {return NumOfDocs;}


    public String toString() {
        return "\nБольница " + "\nНазвание:" + Name + "\nАдрес: " + Adress + "\nГород: " + City + "\nКоличество докторов: " + NumOfDocs;
    }
}
