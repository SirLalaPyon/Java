package MyLib;


public class Customer extends User{

    public Customer(String Fname, String Lname, String Email, String PNumber) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Email = Email;
        this.PNumber = PNumber;
        
        //ID is automatically added and constructed whenever a customer instance is made
        IDCnt +=1;
        this.ID = IDCnt;
    }
    
}
