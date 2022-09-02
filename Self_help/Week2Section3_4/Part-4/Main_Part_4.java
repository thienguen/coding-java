public class Main_Part_4 {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println();
        System.out.println(Area(5.0));
        System.out.println(Area(-1));
        System.out.println(Area(5.0, 4.0));
        System.out.println(Area(-1, 5.0));

        System.out.println();
        convert(525600);
        convert(1051200);
        convert(561600);
        
        System.out.println();
        equality(1, 1, 1);
        
        equality(1, 1, 2);
        equality(1, 2, 1);
        equality(2, 1, 1);
        
        equality(-1, -1, -1);
        equality(1, 2, 3);
        
        System.out.println();
        isCatPlaying(true, 25);
        isCatPlaying(false, 36);
        isCatPlaying(true, 10);
        isCatPlaying(false, 35);
    }

    private static double Area(double radius) {
        double ans;
        if (radius < 0) { return -1.0; } 
            else { return ans = Math.PI * Math.pow(radius, 2); }
    }

    private static double Area(double x, double y) {
        double ans;

        if (x < 0 || y < 0) { return -1.0; }
            else { return ans = x * y; }
    }

    public static void convert(long minutes) {
        if (minutes < 0) { System.out.println(INVALID_VALUE_MESSAGE); }
            else { 
                long a = minutes / ( 60 * 24 * 365 );
                long b = (minutes % ( 60 * 24 * 365 )) / ( 60 * 24 );

                System.out.println(minutes + " mins = " + a + " year(s) and " + b + " day(s)");
            }
    }

    public static void equality(int a, int b, int c) {

        if (a < 0 || b < 0 || c < 0)             { System.out.println(INVALID_VALUE_MESSAGE);}
            else if (a == b && a == c)           { System.out.println("All numbers are equal ");}
            else if (a != b && a != c && b != c) { System.out.println("All numbers are different");}
            else { System.out.println("All numbers neither are different or equal ");}
    }

    public static boolean isCatPlaying(boolean summer, int tempature) {
        if ( summer == true && tempature <= 35 && tempature >= 25) { System.out.println("Ye, it's playing"); return true; }
            else if ( summer == false && tempature <= 45 && tempature >= 25) { System.out.println("Ye, it's playing"); return true; }
                else { System.out.println(INVALID_VALUE_MESSAGE); return false; }
    }

}
