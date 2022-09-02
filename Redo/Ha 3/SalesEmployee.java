public class SalesEmployee extends SalariedEmployee {

    private double commission;
    private double sales;
    
    
    public SalesEmployee(String name, int year, int month, int day, double salary) {
        super(name, year, month, day, salary);
        
    }
    
    public SalesEmployee(String name, int year, int month, int day, double salary, double commission, double sales) {
        super(name, year, month, day, salary);
        this.commission = commission;
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public String DisplayStat() 
    {
        return "SalesEmployee{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", month=" + getMonth() +
                ", day=" + getDay() +
                ", salary=" + getSalary() +
                ", commission=" + commission +
                ", sales=" + sales +
                '}';
    }

}
