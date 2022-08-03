package MyLib;

import java.util.ArrayList;

public class Blocks {
    private String blockName;
    private String address;
    
    private ArrayList<Lots> LotsArray;

    public Blocks(String blockName, String address, ArrayList<Lots> LotsArray) {
        this.blockName = blockName;
        this.address = address;
        this.LotsArray = LotsArray;
    }

    public void setLotsArray(ArrayList<Lots> LotsArray) {
        this.LotsArray = LotsArray;
    }
    
    
    
}
