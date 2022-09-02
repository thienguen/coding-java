package OOPMasterChallenge;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    private String healthyExtra3Name;
    private double healthyExtra3Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public void addHealthyAddition1(String name, double price) {
        // added lentis for an extra 3.41
        this.healthyExtra3Name = name ;
        this.healthyExtra3Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price + '\n');
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price + '\n');
        }
        if (this.healthyExtra3Name != null) {
            hamburgerPrice += this.healthyExtra3Price;
            System.out.println("Added " + this.healthyExtra3Name + " for an extra " + this.healthyExtra3Price + '\n');
        }
        return hamburgerPrice;
    }
}