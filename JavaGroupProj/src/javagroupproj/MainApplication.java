package javagroupproj;

import MyLib.*;
import java.util.ArrayList;
import static javagroupproj.Management.customerList;




public class MainApplication {

    public static void main(String[] args) {
        
        MainMenu1 MainMenu = new MainMenu1();
        MainMenu.setVisible(true);
        MainMenu.setLocationRelativeTo(null);
        
        //Display Output
        //System.out.printf("%-20s %-20s %-20s %-20s\n", "Lot ID", "Lot Size", "Price", "Status");
        //System.out.printf("------------------------------------------------------------------------\n");
        
        //For each type of Lots inside LotsNewYork, print the following
        //for(Lots lot: LotsNewYork){
        //    System.out.printf("%-20s %-20s %-20s %-20s\n", lot.getLotNum(), lot.getLotSize(), lot.getPrice(), lot.getLotStatus());
        //}
        
    }
    
}
