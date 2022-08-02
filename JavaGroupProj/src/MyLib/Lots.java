package MyLib;

public class Lots {
    private String lotNum;
    private double lotSize; //in m^2
    private double price;
    private String lotStatus;//Available, Reserved, Sold

    public Lots(String lotNum, double lotSize, double price, String lotStatus) {
        this.lotNum = lotNum;
        this.lotSize = lotSize;
        this.price = price;
        this.lotStatus = lotStatus;
        
        if (validateStatus(lotStatus)){ //Errors for some reason
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
    
    //========== Setter ==========

    
}
