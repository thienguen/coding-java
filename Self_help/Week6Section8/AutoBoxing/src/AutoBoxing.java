public class AutoBoxing {
    public static void main(String[] args) 
    {   // Tests
        Bank bank = new Bank("Bank of America");
        bank.addBranch("Texas");

        if (bank.addBranch("New York")) {
            System.out.println("New York branch created");
        }

        bank.addCustomer("New York", "Han", 259.45);
        bank.addCustomer("New York", "Thien Nguyen", 185.31);
        bank.addCustomer("New York", "Lam Nguyen", 225.62);

        bank.addBranch("California");
        bank.addCustomer("California", "Nhi", 190.59);

        bank.addCustomerTransaction("California", "Nhi", 79.26);
        bank.addCustomerTransaction("California", "Nhi", 66.48);
        bank.addCustomerTransaction("California", "Waifu", 15.65);

        bank.listCustomers("New York", true);
        bank.listCustomers("California", true);
        
        if (!bank.addCustomer("Texas", "Trump", 5.53)) {
            System.out.println("Error Texas branch does not exist");
        }
        
        bank.listCustomers("Texas", true);

        if (!bank.addBranch("New York")) {
            System.out.println("New York branch already exists");
        }

        if (!bank.addCustomerTransaction("New York", "None", 89.37)) {
            System.out.println("\nCustomer does not exist at branch");
        }

        if (!bank.addCustomer("New York", "Waifu", 36.24)) {
            System.out.println("Customer Waifu already exists");
        } else {
            System.out.println("\nCustomer Waifu created at branch New York\n");
        }
    }
}
