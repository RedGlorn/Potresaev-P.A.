public class Main {
    public static void main(String[] args) {
        PizzaFactory Mozarellafactory = new MozzarellaFactory();
        Mozarellafactory.createSpicy();
        PizzaFactory Guineanfactory = new GuineanFactory();
        Guineanfactory.createSweet();
        PizzaFactory Hawaiianfactory = new HawaiianFactory();
        Hawaiianfactory.createSweet();
        Hawaiianfactory.createSpicy();


        
    }
}