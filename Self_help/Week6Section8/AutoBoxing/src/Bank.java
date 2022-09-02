import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) 
    {   // constructor for Bank class
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) 
    {   // if branch already exists, return false
        if (findBranch(branchName) == null) 
        {   // add method from ArrayList import
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) 
    {   // find branch from Bank class
        Branch branch = findBranch(branchName);
        if (branch != null) 
        {   // if branch exists, add customer to branch
            return branch.newCustomer(customerName, initialAmount);
        }   // if branch does not exist, return false
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) 
    {   // add customer transaction to customer class, private transaction
        Branch branch = findBranch(branchName);
        if (branch != null) 
        {   // if branch exists
            return branch.addCustomerTransaction(customerName, amount);
        }  // else return false
        return false;
    }

    private Branch findBranch(String branchName) 
    {   // search through the arraylist<branch> to find the branch
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) 
    {   // find branches from Bank class
        Branch branch = findBranch(branchName);
        if (branch != null) 
        {   // if branch exists
            System.out.println("\nCustomer details for branch " + branch.getName() + '\n');
            
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            
            for (int i = 0; i < branchCustomers.size(); i++) 
            {   // Print the customer name and the number of transactions
                Customer branchCustomer = branchCustomers.get(i);

                // the name of the customer
                System.out.println("Customer: " + branchCustomer.getName() + " [" + (i + 1) + "]");
                
                if (showTransactions) 
                {   // Print the transactions of the customer
                    System.out.println("Transactions");
                    
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j) + '\n');
                    }
                }
            }
            return true;
        }
        return false;
    }
}
