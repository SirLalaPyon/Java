
package MyLib;


public class Admin extends User{
    private String Username;
    private String Password;
    
    

    public Admin(String Fname, String Lname, String Email, String PNumber) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Email = Email;
        this.PNumber = PNumber;
        
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
    
}
