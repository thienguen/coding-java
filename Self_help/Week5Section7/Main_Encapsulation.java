import Encapsulation.*;

public class Main_Encapsulation {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Thien", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
