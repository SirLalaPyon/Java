package MyLib;

public interface IPatron {
    void subscribe (IObserver observer);
    void unsubscribe (IObserver observer);
    void notifyPatrons();
}
