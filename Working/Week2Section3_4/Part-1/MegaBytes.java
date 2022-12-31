public class MegaBytes {
    
    public static void print(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Input");
        } else {
            
            int mega = (kiloBytes - (kiloBytes % 1024)) / 1024;

            System.out.println(kiloBytes + " KB = " + mega + " MB and " 
                                + (kiloBytes % 1024) + " KB");
        }

    }
}
