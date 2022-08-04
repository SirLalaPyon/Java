package MyLib;

import java.util.ArrayList;


public class Patrons implements IPatron{
    ArrayList<IObserver> Patron = new ArrayList<IObserver>();
    
    String newlotupdate;

    public void subscribe (IObserver observer) {
        Patron.add(observer);
    }
    
    public void unsubscribe (IObserver observer) {
        Patron.remove(observer);
    }
    
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
