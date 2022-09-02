import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a new instance of player, as the way we wanted
        Player Thien = new Player("Thien", 10, 20, 30, 40, 50);
        
        // toString player Thien out
        System.out.println(Thien);
        
        // using write method
        saveObject(Thien);

        // changeing the value
        Thien.setStamina(100);
        Thien.setStrength(50);
        
        // after setting new values, save it to the object
        saveObject(Thien);
        loadObject(Thien);

        // print out to see 
        System.out.println(Thien);

        // new instance of ISaveable named monster
        ISaveable zombie = new Monster("Zombie", 30, 50);
        
        System.out.println("Stength = " + ((Monster) zombie).getStrength());
        System.out.println(zombie);
        
        saveObject(zombie);
        
        System.out.println(zombie);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }

        scanner.close();

        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + "to storage device");
        }
    }

    // This change value by the user, but it is harmful to have
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
