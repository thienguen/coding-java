public class Main {

    public static void main(String[] args) {
        ITelephone Thien;
        Thien = new DeskPhone(123456);
        Thien.powerOn();
        Thien.callPhone(123456);
        Thien.answer();

        Thien = new MobilePhone(24565);
        Thien.powerOn();
        Thien.callPhone(24565);
        Thien.answer();

    }
}
