package MyLib;

public abstract interface IPatron {
    void subscribe (IObserver observer);
    void unsubscribe (IObserver observer);
    void notifyPatrons();
}
