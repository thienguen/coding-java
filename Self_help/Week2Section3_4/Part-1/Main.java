public class Main {
    public static void main(String[] args) {
        System.out.println();
        
        SpeedConverted.printConversion(10.6);
        
        System.out.println();
        MegaBytes.print(1024);
        MegaBytes.print(5000);
        MegaBytes.print(2500);
        
        System.out.println();
        Barkingdog.Bark(true, 1);
        Barkingdog.Bark(false, 2);
        Barkingdog.Bark(true, 8);
        Barkingdog.Bark(true, -1);
        
        System.out.println();
        isLeapYear.cal(-1600);
        isLeapYear.cal(1600);
        isLeapYear.cal(2017);
        isLeapYear.cal(2000);

        System.out.println();
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        
        System.out.println();
        Teen.isTeem(1, 2, 13);
        Teen.isTeem(1, 12, 3);
        Teen.isTeem(-2, 12, 3);
        Teen.isTeem(1, 2, 3);
    }

    
}
