public class WagedEmployee extends Employee {
    private double wage;
    private double hours;

    public WagedEmployee(String name, int year, int month, int day, double wage, double hours) {
        super(name, year, month, day);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String DisplayStat() {
        return "WagedEmployee{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", month=" + getMonth() +
                ", day=" + getDay() +
                ", wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    @Override
    void SetAddress(String street, String city) {
        // TODO Auto-generated method stub
        
    }
}