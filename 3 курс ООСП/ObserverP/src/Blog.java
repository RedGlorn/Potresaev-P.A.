import java.util.ArrayList;
import java.util.List;

public class Blog implements Observable {
    private List<Observer> subscribers;
    private String BlogNews;

    public Blog() {
        subscribers = new ArrayList<>();
    }

    public void NewAnnouncement(String news) {
        this.BlogNews = news;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer o : subscribers)
            o.update(BlogNews);
    }
}