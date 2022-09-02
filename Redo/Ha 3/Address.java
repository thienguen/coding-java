public class Address extends Employee {
    private String street;
    private String city;

    public Address(String street, String city, String name, int year, int month, int day) {
        super(name, year, month, day);
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String DisplayStat() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", month=" + getMonth() +
                ", day=" + getDay() +
                '}';
    }

    @Override
    void SetAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }
    
}
