import java.util.ArrayList;

public class Main {

    private final ArrayList<Stomatology> fileOfStomatology;
    public Main(ArrayList<Stomatology> ListOfStomatology){
        this.fileOfStomatology = ListOfStomatology;
    }

    public void NewStomatology(Stomatology stomatology){
        fileOfStomatology.add(stomatology);
    }

    public ArrayList<Stomatology> SeeStomatology(){
        return fileOfStomatology;
    }

}