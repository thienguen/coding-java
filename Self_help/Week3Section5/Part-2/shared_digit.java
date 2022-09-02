public class shared_digit 
{
    public static boolean shared(int x, int y) 
    {
        // left x, right x
        int lx = x / 10, rx = x % 10;
        
        // left y, right y
        int ly = y / 10, ry = y % 10;

        // within range then...proceed!
        if (x >= 10 && x <= 99 && y >= 10 && y <= 99) { return lx == ly || lx == ry || rx == ly || rx == ry; }
        return false;
    }

    public static void main(String[] args) 
    {
        System.out.println(shared(12, 23));
        System.out.println(shared(9, 99));
        System.out.println(shared(15, 55));
    }
}
