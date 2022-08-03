package MyLib;


public class LotUpdates implements IObserver {
    
    Patrons patron;
    String LName, FName;
    
    public LotUpdates (Patrons patron, String Fname, String Lname) {
        this.patron = patron;
        this.FName = Fname;
        this.LName = Lname;
    }
    
    public void update() {
        System.out.println("Message for " + FName + ' ' + LName + "-->" + patron.newlotupdate);
    }
    
}