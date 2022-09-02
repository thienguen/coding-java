import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) 
    {   // constructor for Branch class
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) 
    {   // find customer from Branch class
        if (findCustomer(customerName) == null) 
        {   // if not found, add customer to branch
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }   // else return false
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) 
    {   // find customer from Branch class
        Customer customer = findCustomer(customerName);
        if (customer != null) 
        {   // if customer exists, we addTransaction
            customer.addTransaction(amount);
            return true;
        }   // else return false
        return false;
    }

    private Customer findCustomer(String customerName) 
    {   // search through the ArrayList<custormer> to find the customer
        for (int i = 0; i < this.customers.size(); i++) 
        {   // get method from ArrayList<customer>
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(customerName)) 
            {   // if found, return customer
                return customer;
            }
        }   // else return false
        return null;
    }   // in which we wanted false when we want to add a new one
}
