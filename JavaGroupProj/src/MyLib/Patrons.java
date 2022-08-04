package MyLib;

import java.util.ArrayList;


public class Patrons implements IPatron{
    ArrayList<IObserver> Patron = new ArrayList<IObserver>();
    
    String newlotupdate;
    int SubscriberCount=0;

    @Override
    public void subscribe (IObserver observer) {
        Patron.add(observer);
        SubscriberCount++;
    }
    
    @Override
    public void unsubscribe (IObserver observer) {
        Patron.remove(observer);
        SubscriberCount--;
    }
    
    @Override
    public void notifyPatrons () {
        for (IObserver observer: Patron)
            observer.update();
    }

    public String getNewlotupdate() {
        return newlotupdate;
    }

    public void setNewlotupdate(String newlotupdate) {
        this.newlotupdate = newlotupdate;
    }
    
    
    
}
