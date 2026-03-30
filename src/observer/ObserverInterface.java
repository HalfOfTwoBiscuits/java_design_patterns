package observer;

interface ObserverInterface {
    // Interface for an object which responds to an event
    // in the code of a subject.
    public void update(AbstractSubject subj);
}
