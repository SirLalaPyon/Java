package MyLib;

public class Blocks {
    private String blockName;
    private String address;
    
    private Lots[] LotsArray = {};

    public Blocks(String blockName, String address, Lots[] LotsArray) {
        this.blockName = blockName;
        this.address = address;
        this.LotsArray = LotsArray;
    }

    public void setLotsArray(Lots[] LotsArray) {
        this.LotsArray = LotsArray;
    }
    
    
    
}
