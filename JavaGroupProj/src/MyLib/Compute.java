package MyLib;

public class Compute {
    public static double CalculateDownPay (int choice, int Price) {
        switch (choice) {
            case 1: return Price * .30;
            case 2: return Price * .40;
            default: return 0;
        }
    }
    public static int CalculatePrice (int choice, int Sqm) {
        switch (choice) {
            //Rural
            case 1: return Sqm * 3000;
            //Urban
            case 2: return Sqm * 4000;
            default: return 0;
        }
    }
    public static double CalculateEstateTaxx (int Price) {
            return Price * .02;
    }
}
