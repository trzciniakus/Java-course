package CH8.AutoboxingUnboxingChallenge;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactionList;

    private Customer(String customerName) {
        this.customerName = customerName;
        this.transactionList = new ArrayList<Double>();
    }

    public static Customer createCustomer (String name, double initialTransaction){
        Customer newCustomer = new Customer(name);
        newCustomer.addCustomerTransaction(initialTransaction);
        return newCustomer;
    }

    public void addCustomerTransaction(double transaction){
        transactionList.add(transaction);
    }

    public void printCustomerTransactions(){
        System.out.println("\tCustomer " + customerName);
        for (int i = 0; i < transactionList.size();i++){
            System.out.println("\t\t" + transactionList.get(i));
        }
    }

    public String getCustomerName(){
        return customerName;
    }
}
