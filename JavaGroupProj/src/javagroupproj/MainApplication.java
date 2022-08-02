package javagroupproj;

import MyLib.*;


public class MainApplication {

    public static void main(String[] args) {
        
        Customer Cus1 = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        Customer Cus2 = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        User Admin1 = new Admin("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        User Admin2 = new Admin("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        
        System.out.println(Cus2.getID());
        System.out.println(Admin1.getID());
    }
    
}
