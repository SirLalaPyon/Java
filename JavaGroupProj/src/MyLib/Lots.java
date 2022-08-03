package MyLib;

public class Lots {
    private String lotNum;
    private double lotSize; //in m^2
    private double price;
    private String lotStatus;//Available, Reserved, Sold
    private String lotLocation;

    public Lots(String lotNum, double lotSize, double price, String lotStatus) {
        this.lotNum = lotNum;
        this.lotSize = lotSize;
        this.price = price;
        this.lotStatus = lotStatus;
        
        if (validateStatus(lotStatus)){
            this.lotStatus = lotStatus;
        }
        else{
            this.lotStatus=null;
            System.out.println("Lot ID: " + lotNum + " has invalid status, available status are (Available, Reserved, Sold)");
        }
    }
    
    public final Boolean validateStatus(String status){
        Boolean isValid=null;
        if (lotStatus == "Available" || lotStatus == "Reserved" || lotStatus == "Sold"){
            isValid=true;
        }
        else{
            isValid=false;
        }
        
        return isValid;
    }
    //========== Getter ==========
    public String getLotStatus() {
        return lotStatus;
    }
    public String getLotNum() {
        return lotNum;
    }

    public double getLotSize() {
        return lotSize;
    }

    public double getPrice() {
        return price;
    }
    
    //========== Setter ==========

    

    
}
