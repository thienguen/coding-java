import java.util.ArrayList;

public class TestCustomer {

    public static void main(String[] args) 
    {   // Tests
        Customer customer = new Customer("Thien", 69.96);
        Customer anotherCustomer;
        
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(3);
        intList.add(1);
        intList.add(5);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
