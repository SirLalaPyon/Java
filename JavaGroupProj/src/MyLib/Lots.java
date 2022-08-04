package MyLib;

public class Lots {
    private String lotNum;
    private int lotSize; //in m^2
    private int price;//Price is automatically calculated
    private String lotStatus;//Available, Reserved, Sold
    private int lotLocation;// 1 = Rural, 2 = Urban
    private String lotArea;//New York, 

    public Lots(String lotNum, int lotSize, String lotStatus, int lotLocation) {
        this.lotNum = lotNum;
        this.lotSize = lotSize;
        
        //Validate status if input is within available choices
        if (validateStatus(lotStatus)){
            this.lotStatus = lotStatus;
        }
        else{
            this.lotStatus=null;
            System.out.println("Lot ID: " + lotNum + " has invalid status, available status are (Available, Reserved, Sold)");
        }
        
        //Validate location if input is within available choices
        if (validateLocation(lotLocation)){
            this.lotLocation = lotLocation;
        }
        else{
            this.lotStatus=null;
            System.out.println("Lot ID: " + lotNum + " has invalid status, available status are (1 = Rural, 2 = Urban");
        }
        
        /*Automatically calculate price
                Rural = sqm * 3000
                Urban = sqm * 4000
        */
        this.price = Compute.CalculatePrice(lotLocation, lotSize);
        
    }
    
    public final Boolean validateStatus(String status){
        Boolean isValid=null;
        if (status == "Available" || status == "Reserved" || status == "Sold"){
            isValid=true;
        }
        else{
            isValid=false;
        }
        
        return isValid;
    }
    
    public final Boolean validateLocation(int location){
        Boolean isValid=null;
        isValid = location == 1 || location == 2;
        
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

    public Integer getPrice() {
        return price;
    }
    
    public String getLotLocation() {
        if(lotLocation == 1)
            return "Rural";
        else
            return "Urban";
    }
    
    //========== Setter ==========

    public void setLotStatus(String lotStatus) {
        this.lotStatus = lotStatus;
    }
    
    
}
