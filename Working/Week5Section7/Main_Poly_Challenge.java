import Polymorphism_Challenge.*;

public class Main_Poly_Challenge {
    public static void main(String[] args) {
        Bugatti bugatti = new Bugatti("Bugatti Chiron", 16);
        Lamborghini lamborghini = new Lamborghini("Lamborghini Aventador", 12);
        Ferrari ferrari = new Ferrari("LaFerrari", 12);

        System.out.println(bugatti.getName());
        System.out.println(bugatti.getCylinders());
        bugatti.startEngine();
        bugatti.accelerate();
        bugatti.brake();

        System.out.println(lamborghini.getName());
        System.out.println(lamborghini.getCylinders());
        lamborghini.startEngine();
        lamborghini.accelerate();
        lamborghini.brake();

        System.out.println(ferrari.getName());
        System.out.println(ferrari.getCylinders());
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.brake();
    }
}