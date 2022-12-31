package Composition_Excercise;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.setName(name);
        this.setWall1(wall1);
        this.setWall2(wall2);
        this.setWall3(wall3);
        this.setWall4(wall4);
        this.setCeiling(ceiling);
        this.bed = bed;
        this.lamp = lamp;
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
     * @return the wall4
     */
    public Wall getWall4() {
        return wall4;
    }

    /**
     * @param wall4 the wall4 to set
     */
    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    /**
     * @return the wall3
     */
    public Wall getWall3() {
        return wall3;
    }

    /**
     * @param wall3 the wall3 to set
     */
    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    /**
     * @return the wall2
     */
    public Wall getWall2() {
        return wall2;
    }

    /**
     * @param wall2 the wall2 to set
     */
    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    /**
     * @return the wall1
     */
    public Wall getWall1() {
        return wall1;
    }

    /**
     * @param wall1 the wall1 to set
     */
    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
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
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
