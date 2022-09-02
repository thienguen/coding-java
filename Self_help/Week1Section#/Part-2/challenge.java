
public class challenge {
    
    public static void main(String[] args) {
    byte newByte = 69;

    short newShort = 100;

    int newInt = 169;

    long newLong = 50000L + 10L * (newByte + newShort + newInt);

    System.out.println(newLong);

    short totalShort = (short) (1000 + 10 * (newByte + newShort + newInt));

    System.out.println(totalShort);
    
    }
}