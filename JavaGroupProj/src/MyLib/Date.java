package MyLib;


public class Date {
    private int day;
    private int month;
    private int year;
    
    public String convertMonth() {
        String [] MonthNamesList = { 
            "Jan", "Feb", "Mar", "Apr", 
            "May", "Jun", "Jul", "Aug",
            "Sept", "Oct", "Nov", "Dec"
        };
        int tempMonth = month - 1;
        return MonthNamesList[tempMonth]; 
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}