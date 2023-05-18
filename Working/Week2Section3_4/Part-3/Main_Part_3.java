/// This program convert minutes and seconds to a full string
/// with output in format HH(h) MM(m) SS(s)

public class Main_Part_3 
{
    
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args)
    {

        // test cases 
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(65, 9000));
    }

    private static String getDurationString(long minutes, long seconds) 
    {
        // check if they are valid input
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) { return INVALID_VALUE_MESSAGE; }

        long hours            = minutes / 60;
        long remainingMinutes = minutes % 60;
        
        // check hours
        String hoursString = hours + "h";
        if (hours < 10) { hoursString = "0" + hoursString; }

        // check minutes
        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) { minutesString = "0" + minutesString; }

        // check seconds
        String secondsString = seconds + "s";
        if (seconds < 10) { secondsString = "0" + secondsString; }

        return hoursString + " " + minutesString + " " + secondsString + "";
    }

    private static String getDurationString(long seconds) 
    {
        if (seconds < 0) { return INVALID_VALUE_MESSAGE; }

        long minutes          = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}


