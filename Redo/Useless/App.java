import java.util.*;

class App {
    static Scanner sc = new Scanner(System.in);
    static int[] a = new int[100];
    static int n = 10;

    public static void Input(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Input " + i + " element: ");
            a[i] = sc.nextInt();
        }
    }

    public void Display(int a[], int n) {
        System.out.println("Display array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.println(" " + a[i]);
        }
    }

    public int Sum(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public int sumDeQuy(int a[], int n) {
        if (n == 0)
            return a[0];
        else
            return sumDeQuy(a, n - 1) + a[n];
    }

    public int max(int a[], int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int maxDeQuy(int a[], int n) {
        if (n == 1)
            return a[0];
        return Math.max(a[n - 1], maxDeQuy(a, n - 1));
    }

    public boolean Check(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] > a[i + 1])
                return false;
        }
        return true;
    }

    public static boolean CheckRecursion(int a[], int n) {
        if (a.length == 0 || n == 0)
            return true;
        if (a[n - 1] > a[n])
            return false;
        return CheckRecursion(a, n - 1);
    }

    public static boolean Palindrome(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] != a[n - i - 1])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Input(a, n);
        System.out.println(maxDeQuy(a, n));
        System.out.println(CheckRecursion(a, n));
        System.out.println(Palindrome(a, n));
    }
}