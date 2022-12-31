import java.util.Scanner;

public class ArrayList {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123 456 7890");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() 
    {   // input
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();

        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        // create a new contact then perform actions
        Contact newContact = Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)) 
        {   // Contact class
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }   // end of Contact class
    }

    private static void updateContact() 
    {   // find contact in Mobile Phone class
        Contact oldContact = findContact();

        // if you couldn't found it, can't modify it
        if (oldContact == null) return;

        // input, same process, should have make a method for it
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();

        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();

        // ready to be updates
        Contact newContact = Contact.createContact(newName, newNumber);

        if (mobilePhone.updateContact(oldContact, newContact)) 
        {   // Mobile class - updateContact
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() 
    {   // find contact in Mobile Phone class
        Contact contact = findContact();
        if (contact == null)
            return;
        if (mobilePhone.removeContact(contact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting record");
        }
    }

    private static void queryContact() {
        Contact contact = findContact();
        if (contact == null)
            return;
        System.out.println("Name " + contact.getName() + " phone number is " + contact.getPhoneNumber());
    }

    private static Contact findContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println("Contact now found.");
            return null;
        }
        return contact;
    }

    private static void startPhone() { System.out.println("Starting phone..."); }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress: ");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your actions: ");
    }
}
