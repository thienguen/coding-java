import java.util.Scanner;

public class MinimumChallenge {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        int[] returnedArray = readIntegers(count);
        int returnedMin     = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:\r");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) { min = array[i]; }
        }
        return min;
    }
}
