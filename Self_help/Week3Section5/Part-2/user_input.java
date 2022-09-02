import java.util.Scanner;

public class user_input 
{
    public static void main(String[] args) 
    {
        calculator();
    }

    public static void calculator() 
    {
        int     counter     = 0;
        int     number      = 0;
        Scanner scanner     = new Scanner(System.in);

        System.out.println("\nEnter number, non integer if you want to exit the function:\n ");

        if (scanner.hasNextInt()) 
        {
            while (scanner.hasNextInt())  { number += scanner.nextInt(); counter++; }

            System.out.format("SUM = %d AVG = %d\n", number, Math.round((double) number / counter));
        } 
        else  { System.out.println("SUM = 0 AVG = 0\n"); }
        
        scanner.close();
    }
    
}
