import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private int stamina;
    private int strength;
    private int spirit;
    private int luck;
    private int speed;
    private String weapon;

    public Player(String name, int stamina, int strength, int spirit, int luck, int speed) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
        this.spirit = spirit;
        this.luck = luck;
        this.speed = speed;
        this.weapon = "Gun";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player {" +
                "name = '" + name + '\'' +
                ", stamina = " + stamina +
                ", strength = " + strength +
                ", spirit = " + spirit +
                ", luck = " + luck +
                ", speed = " + speed +
                ", weapon = " + weapon +
                " }";
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        // quickly convert int to a string to fit the param
        values.add(1, "" + this.stamina + " Stamina" + "\n" );
        values.add(2, "" + this.strength + " Strength" + "\n" );
        values.add(3, "" + this.spirit + " Spirit" + "\n" );
        values.add(4, "" + this.luck + " Luck" + "\n" );
        values.add(5, "" + this.speed + " Speed" + "\n" );
        values.add(6, "" + this.weapon + " Weapon" + "\n" );
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            // since we used the trick on 95, we convert it back to int
            // using parseInt()
            this.stamina = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.spirit = Integer.parseInt(savedValues.get(3));
            this.luck = Integer.parseInt(savedValues.get(4));
            this.speed = Integer.parseInt(savedValues.get(5));
            this.weapon = savedValues.get(6);
        }
    }
}
