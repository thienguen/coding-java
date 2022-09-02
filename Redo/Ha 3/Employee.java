public abstract class Employee extends Date {
    private String name;

    public Employee(String name, int year, int month, int day) {
        super(year, month, day);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String DisplayStat() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", year=" + getYear() +
                ", month=" + getMonth() +
                ", day=" + getDay() +
                '}';
    }

    abstract void SetAddress(String street, String city);
}
