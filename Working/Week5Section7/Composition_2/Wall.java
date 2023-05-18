package Composition_2;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
        System.out.println("Wall    -> Constructor");
    }

    public String getDirection() {
        return direction;
    }
}
