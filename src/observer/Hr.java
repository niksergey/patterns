package observer;

import java.util.ArrayList;
import java.util.List;

public class Hr implements Observable {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.message("We have new job.");
        }
    }
}
