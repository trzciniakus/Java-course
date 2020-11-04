package CH8.AutoboxingUnboxingChallenge;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customersList;

    private Branch(String branchName) {
        this.branchName = branchName;
        this.customersList = new ArrayList<Customer>();
    }

    public static Branch createBranch(String branchName) {
        return new Branch(branchName);
    }

    public void addNewCustomer(String name, double initialTransaction) {
        Customer newCustomer = Customer.createCustomer(name, initialTransaction);
        customersList.add(newCustomer);
    }

    public void addCustomerTransaction(String customerName, double transaction) {
        int position = findCustomerPosition(customerName);
        addCustomerTransaction(position, transaction);
    }

    private void addCustomerTransaction(int position, double transaction) {
        customersList.get(position).addCustomerTransaction(transaction);
    }

    private int findCustomerPosition(String customerName) {
        for (int i = 0; i < customersList.size(); i++) {
            if (customersList.get(i).getCustomerName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean customerExists(String customerName) {
        return findCustomerPosition(customerName) >= 0;
    }

    public String getBranchName() {
        return branchName;
    }

    public void printCustomerTransactions() {
        System.out.println("Branch " + branchName);
        if (customersList.isEmpty()) {
            System.out.println("\tThere are no customers for the branch " + branchName + ".");
        } else {
            for (int i = 0; i < customersList.size(); i++) {
                customersList.get(i).printCustomerTransactions();
            }
        }
    }

    public void printCustomers() {
        System.out.println("Branch " + branchName);
        if (customersList.isEmpty()) {
            System.out.println("\tThere are no customers for the branch " + branchName + ".");
        } else {
            for (int i = 0; i < customersList.size(); i++) {
                System.out.println("\tCustomer" + customersList.get(i).getCustomerName());
            }
        }
    }
}

