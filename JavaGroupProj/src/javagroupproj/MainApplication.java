package javagroupproj;

import MyLib.*;
import java.util.ArrayList;
import static javagroupproj.Management.customerList;




public class MainApplication {
    //set up admin profiles
    public static User Admin1 = new Admin("Elijah", "Tam-od", "elijah@yahoocom", "091234246", "Elijah", "123456");
    public static User Admin2 = new Admin("Jahnreil", "JahnJahn", "Jahn@yahoocom", "09123424", "Jahnreil","123456");
    
    public static void main(String[] args) {
        MainMenu1 MainMenu = new MainMenu1();
        MainMenu.setVisible(true);
        MainMenu.setLocationRelativeTo(null);
    }
}
