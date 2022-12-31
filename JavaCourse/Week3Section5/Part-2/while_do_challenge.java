public class while_do_challenge {

    public static void main(String[] args) 
    {
        // var(s) declarations
        int number           = 5;
        int finishNumber     = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) 
        {
            if (!isEvenNumber(number)) { number++; continue; }

            System.out.println("Even number " + number);
            
            number++;

            evenNumbersFound++;

            if (evenNumbersFound >= 5) { break; }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) 
    {
        if ((number % 2)  == 0) { return true; } else { return false; }
    }
}
