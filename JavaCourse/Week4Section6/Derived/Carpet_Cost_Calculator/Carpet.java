package Derived.Carpet_Cost_Calculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) cost = 0;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
