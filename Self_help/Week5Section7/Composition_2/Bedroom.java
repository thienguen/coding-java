package Composition_2;

public class Bedroom {
    private String  name;
    private Wall    wall1;
    private Wall    wall2;
    private Wall    wall3;
    private Wall    wall4;
    private Ceiling ceiling;
    private Bed     bed;
    private Lamp    lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.setName(name);
        this.wall1   = wall1;
        this.wall2   = wall2;
        this.wall3   = wall3;
        this.wall4   = wall4;
        this.setCeiling(ceiling);
        this.bed     = bed;
        this.lamp    = lamp;
        System.out.println("Bedroom -> Constructor");
    }

    /**
     * @return the ceiling
     */
    public Ceiling getCeiling() {
        return ceiling;
    }

    /**
     * @param ceiling the ceiling to set
     */
    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        bed.make();
        System.out.println("Bedroom -> Making Bedroom");
    }

    public void direction1() {
        System.out.println("Bedroom -> Direction: " + wall1.getDirection());
    }

    public void direction2() {
        System.out.println("Bedroom -> Direction: " + wall2.getDirection());
    }

    public void direction3() {
        System.out.println("Bedroom -> Direction: " + wall3.getDirection());
    }

    public void direction4() {
        System.out.println("Bedroom -> Direction: " + wall4.getDirection());
    }
}
