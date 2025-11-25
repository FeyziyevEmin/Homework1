package lesson_12.HomeWork_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewsPublisher {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    public Iterator<Subscriber> getIterator() {
        return subscribers.iterator();
    }

    public void notifySubscribers(String news) {
        Iterator<Subscriber> iterator = getIterator();
        while (iterator.hasNext()) {
            iterator.next().update(news);
        }
    }

    public synchronized void publishNews(String news) {
        this.latestNews = news;
        System.out.println("Publisher: Yeni xəbər yayımlandı -> " + news);
        notifyAll();
    }

    public synchronized String getLatestNews() throws InterruptedException {
        while (latestNews == null) {
            wait();
        }
        String news = latestNews;
        latestNews = null;
        return news;
    }
}

