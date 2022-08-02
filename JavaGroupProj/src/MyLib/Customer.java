package MyLib;


public class Customer {
    private String Cust_Fname;
    private String Cust_Lname;
    private String Cust_Email;
    private String Cust_PNumber;
    private int Cust_ID;
    
    //ID number counter
    static private int IDCnt = 0;

    public Customer(String Cust_Fname, String Cust_Lname, String Cust_Email, String Cust_PNumber) {
        this.Cust_Fname = Cust_Fname;
        this.Cust_Lname = Cust_Lname;
        this.Cust_Email = Cust_Email;
        this.Cust_PNumber = Cust_PNumber;
        
        //ID is automatically added and constructed whenever a customer instance is made
        IDCnt +=1;
        this.Cust_ID = IDCnt;
    }

    
    //=================== Getter ===================
    public String getCust_Fname() {
        return Cust_Fname;
    }

    public String getCust_Lname() {
        return Cust_Lname;
    }

    public String getCust_Email() {
        return Cust_Email;
    }

    public String getCust_PNumber() {
        return Cust_PNumber;
    }
    

    public int getID() {
        return Cust_ID;
    }

    public static int getIDCnt() {
        return IDCnt;
    }
    
    
    
}
