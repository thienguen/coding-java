public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Courage");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Devil Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s

    }
}
}
