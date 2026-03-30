package observer;

interface ObserverInterface<T extends AbstractSubject>  {
    // Interface for an object which responds to an event
    // in the code of a subject. It is passed the subject as an argument.
    // The type variable represents the type of subject it observes.
    public void update(T subj);
}
