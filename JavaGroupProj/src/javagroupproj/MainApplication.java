package javagroupproj;

import MyLib.*;


public class MainApplication {

    public static void main(String[] args) {
        
        Customer Elijah = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        
        Elijah.getCust_PNumber();
        System.out.println(Elijah.getCust_PNumber());
    }
    
}
