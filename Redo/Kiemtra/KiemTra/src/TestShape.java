import Dohoa.*;


public class TestShape {
    
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.calcArea());
        System.out.println(square.calcPerimeter());
        square.draw();


        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());
        rectangle.draw();

        Circle circle = new Circle(10);
        System.out.println(circle.calcArea());
        System.out.println(circle.calcPerimeter());
        circle.draw();
    }

}
