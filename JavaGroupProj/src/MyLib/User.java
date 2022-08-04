
package MyLib;


public class User {
    protected String Fname;
    protected String Lname;
    protected String Email;
    protected String PNumber;
    protected int ID;
    
    
    public Boolean VerifyCreds(String UName, String Passw) {
        return true;
    }
    
    //=================== Getter ===================
    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getEmail() {
        return Email;
    }

    public String getPNumber() {
        return PNumber;
    }
    

    public int getID() {
        return ID;
    }
}
