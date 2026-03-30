package observer;

import java.util.ArrayList;

abstract class AbstractSubject {
    // Base class for a subject.
    // It sends notifications to observers with the `notify_` method.

    // Store a list of observer objects.
    private final ArrayList<ObserverInterface> observers = new ArrayList<>();

    // Methods to add and remove.
    public void attach(ObserverInterface obs) {
        observers.add(obs);
    }
    public void detach(ObserverInterface obs) {
        observers.remove(obs);
    }

    // Notify method iterates through observers and updates each on the change.
    // The subject object is passed so that the observer can make use of its data.
    // The annotation surpresses a warning about the subject's type not necessarily
    // matching the argument to `update()`, if an observer is added to the wrong type of subject.
    @SuppressWarnings("unchecked")
    public void notify_() {
        for (ObserverInterface o : observers) {
            o.update(this);
        }
    }
}
