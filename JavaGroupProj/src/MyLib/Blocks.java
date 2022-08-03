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
    
    //========== Getters ==========
    public ArrayList<Lots> getLotsArray() {
        return LotsArray;
    }

    public String getBlockName() {
        return blockName;
    }

    public String getAddress() {
        return address;
    }
    
    //========== Setters ==========
    public void setLotsArray(ArrayList<Lots> LotsArray) {
        this.LotsArray = LotsArray;
    }
    
    
    
}
