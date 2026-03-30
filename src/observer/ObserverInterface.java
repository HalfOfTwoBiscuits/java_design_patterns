package observer;

interface ObserverInterface<T extends AbstractSubject>  {
    // Interface for an object which responds to an event
    // in the code of a subject.
    public void update(T subj);
}
