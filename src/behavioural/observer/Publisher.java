package behavioural.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {
    Map<String, List<Subscriber>> listeners = new HashMap<>();
    
    public Publisher(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String key, Subscriber subscriber) {
        List<Subscriber> subscribers = listeners.get(key);
        subscribers.add(subscriber);
    }

    public void unsubscribe(String key, Subscriber subscriber) {
        List<Subscriber> subscribers = listeners.get(key);
        subscribers.remove(subscriber);
    }

    public void notify(String key) {
        List<Subscriber> subscribers = listeners.get(key);
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }
}
