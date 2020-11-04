package CH8.AutoboxingUnboxingChallenge;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchList = new ArrayList<Branch>();
    }

    public void addBranch(String branchName) {
        Branch newBranch = Branch.createBranch(branchName);
        branchList.add(newBranch);
    }

    public void addNewCustomer(String branchName, String customerName, double initialTransaction) {
        int position = findBranchPosition(branchName);
        branchList.get(position).addNewCustomer(customerName,initialTransaction);
    }

    public void addCustomerTransaction(String branchName, String customerName, double transaction){
        int position = findBranchPosition(branchName);
        branchList.get(position).addCustomerTransaction(customerName,transaction);
    }

    private int findBranchPosition(String branchName) {
        for (int i = 0; i < branchList.size(); i++) {
            if (branchList.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean customerExists(String branchName, String customerName){
        if (!branchExists(branchName)){
            return false;
        } else {
            int position = findBranchPosition(branchName);
            Branch branch = branchList.get(position);
            return branch.customerExists(customerName);
        }
    }

    public boolean branchExists(String branchName) {
        return findBranchPosition(branchName) >= 0;
    }

    public void printCustomerTransactions(){
        if (branchList.isEmpty()) {
            System.out.println("There has not been added any branches yet");
        } else {
            for (int i = 0; i < branchList.size(); i++ ){
                branchList.get(i).printCustomerTransactions();
            }
        }
    }

    public void printCustomers(){
        if (branchList.isEmpty()) {
            System.out.println("There has not been added any branches yet");
        } else {
            for (int i = 0; i < branchList.size(); i++ ){
                branchList.get(i).printCustomers();
            }
        }
    }
}
