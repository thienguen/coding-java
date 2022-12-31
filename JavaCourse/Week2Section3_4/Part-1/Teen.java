public class Teen {
    public static boolean isTeem(int a, int b, int c) {
        if (a >= 13 && b <= 19) {
            System.out.println("Worked");
            return true;
        } else if (b >= 13 && b <= 19) {
            System.out.println("Worked");
            return true;
        } else if (c >= 13 && b <= 19) {
            System.out.println("Worked");
            return true;
        } else {
            System.out.println("Nuh uh");
            return false;
        }
    }
}
