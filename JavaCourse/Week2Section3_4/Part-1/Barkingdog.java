public class Barkingdog {
    public static boolean Bark(boolean Bark_Or_Not, int hour) {
        
        if (hour < 0 || hour > 23 || Bark_Or_Not == false) {
            System.out.println("false");
            return false;
            
        } else {
            if (hour < 8 || hour > 22) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }
    }
}
