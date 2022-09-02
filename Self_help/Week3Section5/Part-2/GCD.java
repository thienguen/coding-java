public class GCD 
{

    public static void main(String[] args) 
    {
        System.out.println(GCDD(25, 15));
        System.out.println(GCDD(12, 30));
        System.out.println(GCDD(9, 18));
        System.out.println(GCDD(81, 153));
    }

    public static int GCDD(int first, int second) 
    {
        if (first < 10 || second < 10) { return -1; }
        for (int i = first; i > 0; i--) 
        {
            if (first % i == 0 && second % i == 0)  { return i; }
        }
        return 0;
    }

}
