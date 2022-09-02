import java.util.Scanner;

public class DieuKhienChuongTrinh {

    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("---");
            System.out.println("1. Waged Employee");
            System.out.println("2. Salaried Employee");
            System.out.println("3. Sales Employee");
            System.out.println("4. Exit/n");
            System.out.print("Choose an Employee or an Action: ");

            // variables used by all employee types
            String name;
            int year;
            int month;
            int day;
            String street;
            String city;

            // variables used by specified employee types
            double wage;
            double hours;
            double salary;
            double commission;
            double sales;

            int selection = keyboard.nextInt();
            switch (selection) {
                case 1:
                    name = InputString("Name");
                    wage = InputDouble("Wage");
                    hours = InputDouble("Hours");
                    year = InputInt("Year");
                    month = InputInt("Month");
                    day = InputInt("Day");
                    street = InputString("Street");
                    city = InputString("City");
                    WagedEmployee we = new WagedEmployee(name, year, month, day, wage, hours);
                    we.SetAddress(street, city);
                    System.out.println(we.DisplayStat());
                    break;
                case 2:
                    name = InputString("Name");
                    salary = InputDouble("Salary");
                    year = InputInt("Year");
                    month = InputInt("Month");
                    day = InputInt("Day");
                    street = InputString("Street");
                    city = InputString("City");
                    SalariedEmployee se = new SalariedEmployee(name, year, month, day, salary);
                    se.SetAddress(street, city);
                    System.out.println(se.DisplayStat());
                    break;
                case 3:
                    name = InputString("Name");
                    salary = InputDouble("Salary");
                    commission = InputDouble("Commission");
                    sales = InputDouble("Sales");
                    year = InputInt("Year");
                    month = InputInt("Month");
                    day = InputInt("Day");
                    street = InputString("Street");
                    city = InputString("City");
                    SalesEmployee se1 = new SalesEmployee(name, year, month, day, salary, commission, sales);
                    se1.SetAddress(street, city);
                    System.out.println(se1.DisplayStat());
                    break;
                case 4:
                    break;
            }
        }
    }

    static String InputString(String message) {
        System.out.print(message + ": ");
        return keyboard.next();
    }

    static int InputInt(String message) {
        System.out.print(message+ ": ");
        return keyboard.nextInt();
    }

    static double InputDouble(String message) {
        System.out.print(message+ ": ");
        return keyboard.nextDouble();
    }
}
