public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int year, int month, int day, double salary) {
        super(name, year, month, day);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Overide
    public String DisplayStat() {
        return "SalariedEmployee{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", month=" + getMonth() +
                ", day=" + getDay() +
                ", salary=" + salary +
                '}';
    }

    @Override
    void SetAddress(String street, String city) {
        // TODO Auto-generated method stub
        
    }
}
