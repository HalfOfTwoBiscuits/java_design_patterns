package observer;

import java.util.ArrayList;

abstract class AbstractSubject {
    private ArrayList<ObserverInterface> observers = new ArrayList<ObserverInterface>();
    public void attach(ObserverInterface obs) {
        observers.add(obs);
    }
    public void detach(ObserverInterface obs) {
        observers.remove(obs);
    }
    public void notify_() {
        for (ObserverInterface o : observers) {
            o.update(this);
        }
    }
}
