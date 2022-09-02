public class all_factor
{
    public static void factors(int number) {

        if (number >= 0) 
        {
            for (int i = 1; i <= number; i++) 
            { 
                if (number % i == 0) { System.out.print(i + " "); } 
            } 
            System.out.println();
        } 
        else { System.out.println("Invalid Value"); }
    }

    public static void main(String[] args) 
    {
        factors(6);
        factors(32);
        factors(10);
        factors(-1);
    }
}
