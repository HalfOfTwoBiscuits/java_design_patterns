package src.observer;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void attach(Observer obs) {
        observers.add(obs);
    }
    public void detach(Observer obs) {
        observers.remove(obs);
    }
    public void notify_() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
