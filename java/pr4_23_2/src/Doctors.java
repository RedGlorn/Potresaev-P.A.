public class Doctors extends Stomatology{
    private String BreName;
    private String DFIO;
    private String Post;
    private String ScTitle;
    private int WE;

    public Doctors(String Name, String Adress, String City, int NumOfDocs, String BreName, String DFIO, String Post, String ScTitle, int WE){
        super(Name, Adress, City, NumOfDocs);
        this.BreName = BreName;
        this.DFIO =DFIO;
        this.Post = Post;
        this.ScTitle = ScTitle;
        this.WE =WE;
    }
    public void setBrName(String BrName) {this.BreName= BrName;}
    public String getBrName() {return BreName;}

    public void setDFIO(String BrName) {this.DFIO= DFIO;}
    public String getDFIO() {return DFIO;}

    public void setPost(String Post) {this.Post= Post;}
    public String getPost() {return Post;}

    public void setScTitle(String ScTitle) {this.ScTitle= ScTitle;}
    public String getScTitle() {return ScTitle;}

    public void setWE(int WE) {this.WE = WE;}
    public int getWE() {return WE;}

    public String toString() {
        return super.toString() + "\nНазвание отделения: " + BreName + "\nФИО Врача: " + DFIO
                + "\nДолжность: " + Post + "\nНаучное звание:" +ScTitle + "\nСтаж(лет): " + WE;
    }
}
