public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        a = a * 1000;
        b = b * 1000;
    
        int a1 = (int) a;
        int b1 = (int) b;
    
        if (a1 == b1) {
            System.out.println("it works");
            return true;
        }
    
        else {
            System.out.println("it doesn't work");
            return false;
        }
    }
}