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
        
        validateStatus(lotStatus);
        
        this.lotStatus = lotStatus;
        
        
    }
    
    public final void validateStatus(String status){
        Boolean isValid=null;
        if (lotStatus == "Available" || lotStatus == "Reserved" || lotStatus == "Sold"){
            isValid=true;
        }
        else{
            isValid=false;
        }
    }
    
    //========== Setter ==========

    public void setLotStatus(String lotStatus) {
        if (lotStatus == "Available"){
            this.lotStatus = lotStatus;
        }
        else if (lotStatus == "Reserved"){
            this.lotStatus = lotStatus;
        }
        else if (lotStatus == "Sold"){
            this.lotStatus = lotStatus;
        }
        else{
            System.out.println("Lot " + lotNum + " does not have a correct status (Available, Reserved, Sold)");
        }
        
    }
    
}
