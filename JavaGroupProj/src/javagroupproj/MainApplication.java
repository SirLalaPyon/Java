package javagroupproj;

import MyLib.*;




public class MainApplication {

    public static void main(String[] args) {
        
        Customer Cus1 = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        Customer Cus2 = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        Admin Admin1 = new Admin("Elijah", "Tam-od", "elijah@yahoocom", "091234246", "Elijah", "123456");
        Admin Admin2 = new Admin("Jahnreil", "JahnJahn", "Jahn@yahoocom", "09123424", "Jahnreil","123456");
        
        Lots LotA1 = new Lots("A1", 100, 2000, "das");
        
        System.out.println("Customer 2 ID:" + Cus2.getID());
        System.out.println("Admin 1 ID:" + Admin1.getID());
        System.out.println("LotA1 status: "+ LotA1.getLotStatus());
        
        
        
        
    }
    
}
