public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name, Observable o) {
        this.name = name;
        o.registerObserver(this);
    }

    @Override
    public void update(String news) {
        System.out.println(name + " узнал новость: " + news);
    }
}