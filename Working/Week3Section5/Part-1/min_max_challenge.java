import java.util.Scanner;

public class min_max_challenge 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        int     min     = Integer.MAX_VALUE;
        int     max     = Integer.MIN_VALUE;
        
        while (true)
        {
            System.out.print("Enter number, or non-integer if you want to exit the program: " );
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) 
            {
                int number = scanner.nextInt();

                if (number > max)  { max = number; }

                if (number < min)  { min = number; }
                
            } 
            else { break; }

            scanner.nextLine(); // handle input
        }

        System.out.println("Min = "+ min + ", Max = " + max);
        scanner.close();
    }
}
