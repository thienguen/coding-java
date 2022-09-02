public class isLeapYear {
    public static boolean cal(int year) {
        if (year < 0 || year > 9999) {
            System.out.println("false");
            return false;
        } else {
            if ((year % 4) == 0) {
                System.out.println("true");
                return true;
            } else if ((year % 100) == 0) {
                System.out.println("true");
                return true;
            } else if ((year % 400) == 0) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }
    }
}
