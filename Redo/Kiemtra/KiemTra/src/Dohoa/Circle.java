package Dohoa;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(double radius, boolean filled) {
        super();
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Ve hinh Circle\n");
        // draw circle with * inside and empty string at 4 corners

        for (int i = 0; i < this.radius; i++) {
            for (int j = 0; j < this.radius; j++) {

                if (i == 0 & j == 0 || i == 0 & j == this.radius - 1 || i == this.radius - 1 & j == 0 || i == this.radius - 1 & j == this.radius - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }


            }
            System.out.println();
        }



    }
}
