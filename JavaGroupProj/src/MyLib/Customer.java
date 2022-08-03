package MyLib;


public class Customer extends User{
    static private int IDCnt = 0;
    
    public Customer(String Fname, String Lname, String Email, String PNumber) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Email = Email;
        this.PNumber = PNumber;
        
        //ID is automatically added and constructed whenever a customer instance is made
        IDCnt +=1;
        this.ID = IDCnt;
    }

    public static String getCustomerName(Customer customer) {
        String customerName = customer.Fname + " " +customer.Lname;
        return customerName;
    }
    
}
