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
        Blocks BlockE = new Blocks("BlockE", "Virginia", null);
        
        //========== Lots List ==========
        //public Lots(String lotNum, double lotSize, double price, String lotStatus
        Lots LotA1 = new Lots("A1", 17, "Available", 1);
        Lots LotA2 = new Lots("A2", 18,"Reserved", 2);
        Lots LotA3 = new Lots("A3", 19,"Available", 2);
        Lots LotA4 = new Lots("A4", 20,"Available", 1);
        Lots LotA5 = new Lots("A5", 21,"Reserved", 2);
        Lots LotA6 = new Lots("A6", 25,"Available", 2);
        Lots LotA7 = new Lots("A7", 26,"Available", 1);
        Lots LotA8 = new Lots("A8", 27,"Sold", 2);
        Lots LotA9 = new Lots("A9", 28,"Available", 1);
        Lots LotA10 = new Lots("A10", 29,"Available",2);
        Lots LotA11 = new Lots("A11", 33,"Available",1);
        Lots LotA12 = new Lots("A12", 34,"Sold",2);
        Lots LotA13 = new Lots("A13", 35,"Reserved",2);
        Lots LotA14 = new Lots("A14", 36,"Available",1);
        Lots LotA15 = new Lots("A15", 37,"Available",2);
        Lots LotA16 = new Lots("A16", 47, "Sold", 1);
        Lots LotA17 = new Lots("A17", 48,"Reserved",1);
        Lots LotA18 = new Lots("A18", 49,"Sold", 2);
        Lots LotA19 = new Lots("A19", 50,"Sold", 2);
        Lots LotA20 = new Lots("A20", 51,"Available",1);
        
        ArrayList<Lots> LotsNewYork= new ArrayList<>();
        LotsNewYork.add(LotA1);
        LotsNewYork.add(LotA2);
        LotsNewYork.add(LotA3);
        LotsNewYork.add(LotA4);
        LotsNewYork.add(LotA5);
        LotsNewYork.add(LotA6);
        LotsNewYork.add(LotA7);
        LotsNewYork.add(LotA8);
        
        BlockA.setLotsArray(LotsNewYork);//Assign lots to block
        
        //Display Output
        //System.out.printf("%-20s %-20s %-20s %-20s\n", "Lot ID", "Lot Size", "Price", "Status");
        //System.out.printf("------------------------------------------------------------------------\n");
        
        //For each type of Lots inside LotsNewYork, print the following
        //for(Lots lot: LotsNewYork){
        //    System.out.printf("%-20s %-20s %-20s %-20s\n", lot.getLotNum(), lot.getLotSize(), lot.getPrice(), lot.getLotStatus());
        //}
        
    }
    
}
