package javagroupproj;

import MyLib.*;
import java.util.ArrayList;




public class MainApplication {

    public static void main(String[] args) {
        
        Customer Cus1 = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        Customer Cus2 = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        Admin Admin1 = new Admin("Elijah", "Tam-od", "elijah@yahoocom", "091234246", "Elijah", "123456");
        Admin Admin2 = new Admin("Jahnreil", "JahnJahn", "Jahn@yahoocom", "09123424", "Jahnreil","123456");
        
        System.out.println("Customer 2 ID:" + Cus2.getID());
        System.out.println("Admin 1 ID:" + Admin1.getID());
        
        System.out.println(Admin1.VerifyCreds("Elijah", "123456"));
        
        //========== Blocks List ==========
        //public Blocks(String blockName, String address, Lots[] LotsArray)
        Blocks BlockA = new Blocks("BlockA", "New York", null);
        Blocks BlockB = new Blocks("BlockB", "California", null);
        Blocks BlockC = new Blocks("BlockC", "Los Angeles", null);
        Blocks BlockD = new Blocks("BlockD", "Texas", null);
        Blocks BlockE = new Blocks("BlockE", "Los Angeles", null);
        
        //========== Lots List ==========
        //public Lots(String lotNum, double lotSize, double price, String lotStatus
        Lots LotA1 = new Lots("A1", 23, 540, "Available");
        Lots LotA2 = new Lots("A2", 42, 1250, "Reserved");
        Lots LotA3 = new Lots("A3", 22, 640, "Available");
        Lots LotA4 = new Lots("A4", 82, 2450, "Available");
        Lots LotA5 = new Lots("A5", 33, 1560, "Reserved");
        Lots LotA6 = new Lots("A6", 34, 2200, "Available");
        Lots LotA7 = new Lots("A7", 50, 4200, "Available");
        Lots LotA8 = new Lots("A8", 78, 5500, "Sold");
        Lots LotA9 = new Lots("A9", 60, 3220, "Available");
        Lots LotA10 = new Lots("A10", 50, 4620, "Available");
        Lots LotA11 = new Lots("A11", 67, 5230, "Available");
        Lots LotA12 = new Lots("A12", 74, 5420, "Sold");
        Lots LotA13 = new Lots("A13", 93, 9920, "Reserved");
        Lots LotA14 = new Lots("A14", 45, 3220, "Available");
        Lots LotA15 = new Lots("A15", 39, 2220, "Available");
        Lots LotA16 = new Lots("A16", 24, 4550, "Sold");
        Lots LotA17 = new Lots("A17", 67, 6770, "Reserved");
        Lots LotA18 = new Lots("A18", 15, 500, "Sold");
        Lots LotA19 = new Lots("A19", 67, 4550, "Sold");
        Lots LotA20 = new Lots("A20", 58, 2330, "Available");
        
        ArrayList<Lots> LotsNewYork= new ArrayList<>();
        LotsNewYork.add(LotA1);
        LotsNewYork.add(LotA2);
        LotsNewYork.add(LotA3);
        LotsNewYork.add(LotA4);
        LotsNewYork.add(LotA5);
        LotsNewYork.add(LotA6);
        LotsNewYork.add(LotA7);
        LotsNewYork.add(LotA8);
        
        //BlockA.setLotsArray(LotsNewYork);//Assign lots to block
        
        //Display Output
        //System.out.printf("%-20s %-20s %-20s %-20s\n", "Lot ID", "Lot Size", "Price", "Status");
        //System.out.printf("------------------------------------------------------------------------\n");
        
        //For each type of Lots inside LotsNewYork, print the following
        //for(Lots lot: LotsNewYork){
        //    System.out.printf("%-20s %-20s %-20s %-20s\n", lot.getLotNum(), lot.getLotSize(), lot.getPrice(), lot.getLotStatus());
        //}
        
    }
    
}
