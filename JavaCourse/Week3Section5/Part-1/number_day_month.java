public class number_day_month 
{

    public static  boolean isLeapYear(int year) 
    {
        boolean leap = false;
        if (year < 1 || year > 9999) { return leap; } 
        else
        {
            if ((year % 4) == 0  && (year % 100 != 0)) { leap = true; }
                else if ((year % 100) == 0 && (year % 400 ) == 0 ) { leap = true;}
                    else { leap = false; }
        }
        return leap;
    }

    public static int getDaysInMonth(int month, int year) 
    {
        if (month < 1 || month > 12 || year < 1 || year > 9999) { return -1; }
        
        int days = 0;
        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10 : case 12: days = 31; break;
            
            case 2: if (isLeapYear(year)) { days = 29; break; } days = 28; break;  // [if] changed you
            
            case 4: case 6: case 9 : case 11: days = 30; break;
            
            default: days = -1; break;
        }
        return days;
    }

    public static void main(String[] args) 
    {
        int answer = getDaysInMonth(5, 2002);
        
        System.out.println("The month of your input is " + answer);
        
        answer = getDaysInMonth(2, 2000);
        
        System.out.println("This is purely a test " + answer);
    }

}