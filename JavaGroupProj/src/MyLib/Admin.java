
package MyLib;


public class Admin extends User{
    private String Username;
    private String Password;
    
    static private int IDCnt = 0;

    public Admin(String Fname, String Lname, String Email, String PNumber, String UserName, String Pass) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Email = Email;
        this.PNumber = PNumber;
        this.Username = UserName;
        this.Password = Pass;
        //ID is automatically added and constructed whenever an admin instance is made
        IDCnt +=1;
        this.ID = IDCnt;
    }
    //=================== Getter ===================

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
    public Boolean VerifyCreds(String UName, String Passw) {
        
        if (Username.equals(UName)) {
            if (Password.equals(Passw)){ 
                return true;
            }
        }
        return false;     
    }
    
}
