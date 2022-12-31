import Derived.*;
import Derived.Carpet_Cost_Calculator.*;

public class App 
{
    public static void main(String[] args) 
    {
        // TestCar();
        // TestSimpleCal();
        // TestPerson();
        // TestAccount();
        // TestWall();
        // TestPoint();
        // TestCarpet_Cost();
        // TestComplex_Operations();
        // TestCylinder();
        // TestCuboid();
    }

    public static void TestSimpleCal() 
    {
        SimpleCalculator calculator = new SimpleCalculator();
        
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        
        System.out.println("\nadd = " + calculator.getAdditionResult());
        System.out.println("\nsubtract = " + calculator.getSubtractionResult());
        
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        
        System.out.println("\nmultiply = " + calculator.getMultiplicationResult());
        System.out.println("\ndivide = " + calculator.getDivisionResult());
    }

    public static void TestCar() 
    {
        Car porsche = new Car();
        Car holden  = new Car();
        
        porsche.setModel("lmao");
        
        System.out.println("Model is " + porsche.getModel());
        
        holden.setModel("Commodore\n");
    }

    public static void TestPerson() 
    {
        Person person = new Person();

        person.setFirstName("Thien");
        person.setLastName("Nguyen");
        person.setAge(10);

        System.out.println("fullName = " + person.getFirstName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("Bo");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setLastName("Van Ky");
        System.out.println("fullName = " + person.getFullName());
    }

    public static void TestAccount()
    {   // call at the start of creating object
        // then empty ctor is called
        Account bobsAccount = new Account();
        // System.out.println(bobsAccount.getNumber());
        // System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }

    public static void TestWall() 
    {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    public static void TestPoint() {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public static void TestCarpet_Cost() {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

    public static void TestComplex_Operations() {
        Complex_Operations one = new Complex_Operations(1.0, 1.0);
        Complex_Operations number = new Complex_Operations(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("one.real= " + number.getReal());
        System.out.println("one.imaginary= " + number.getImaginary());
    }

    public static void TestCylinder() {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.radius = " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());
    }

    public static void TestCuboid() {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.width= " + rectangle.getLength());
        System.out.println("rectangle.width= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

}
