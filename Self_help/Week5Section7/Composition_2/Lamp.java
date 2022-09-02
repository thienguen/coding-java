package Composition_2;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
        System.out.println("Lamp    -> Constructor");
    }

    public void turnOn() {
        System.out.println("Lamp    -> Turning on");
    }

    public void turnOff() {
        System.out.println("Lamp    -> Turning off");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
