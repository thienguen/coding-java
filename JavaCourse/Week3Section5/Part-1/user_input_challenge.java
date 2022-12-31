import java.util.Scanner;

public class user_input_challenge 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int     counter = 0;
        int     sum     = 0;

        while (counter < 10) 
        {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) 
            {
                int number = scanner.nextInt();
                    counter++;
                    sum    += number;
            } 
            else
            {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("\nSum of all 10 input is: " + sum);
        scanner.close();

    }
}
