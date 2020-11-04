package CH8.AutoboxingUnboxingChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank myBanco = new Bank("My Banco");

    public static void main(String[] args) {

        printInstructions();
        boolean quit = false;
        int choice;
        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    myBanco.printCustomers();
                    break;
                case 5:
                    myBanco.printCustomerTransactions();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("Press:");
        System.out.println("\t0 - to print instructions");
        System.out.println("\t1 - to add new branch");
        System.out.println("\t2 - to add new customer to specific branch");
        System.out.println("\t3 - to add new transaction to specific customer");
        System.out.println("\t4 - to show a list of customers");
        System.out.println("\t5 - to show a list of customer transactions");
        System.out.println("\t6 - to quit");
    }

    public static void addBranch() {
        System.out.println("Enter name for the new branch:");
        String branchName = scanner.nextLine();
        if(myBanco.branchExists(branchName)){
            System.out.println("Branch " + branchName + " already exists.");
        } else {
            myBanco.addBranch(branchName);
            System.out.println("Branch " + branchName + " has been successfully added.");
        }

    }

    public static void addCustomer() {
        System.out.println("Enter name of the branch for customer you want to add:");
        String branchName = scanner.nextLine();
        if (myBanco.branchExists(branchName)) {
            System.out.println("Enter name of the customer:");
            String customerName = scanner.nextLine();
            if (myBanco.customerExists(branchName, customerName)) {
                System.out.println("Customer " + customerName + " already exists in branch " + branchName + ".");
            } else {
                System.out.println("Enter value of initial transaction:");
                double initialTransaction = scanner.nextDouble();
                scanner.nextLine();
                myBanco.addNewCustomer(branchName, customerName, initialTransaction);
                System.out.println("Customer " + customerName + " has been successfully added");
            }
        } else {
            System.out.println("Branch " + branchName + " does not exist on file.");
        }
    }

    public static void addTransaction() {
        System.out.println("Enter name of the branch for transaction you want to add:");
        String branchName = scanner.nextLine();
        if (myBanco.branchExists(branchName)) {
            System.out.println("Enter name of the customer:");
            String customerName = scanner.nextLine();
            if (myBanco.customerExists(branchName, customerName)) {
                System.out.println("Enter value of the transaction:");
                double transaction = scanner.nextDouble();
                scanner.nextLine();
                myBanco.addCustomerTransaction(branchName, customerName, transaction);
                System.out.println("Transaction of " + transaction + " for " + customerName + " has been successfully added");
            } else {
                System.out.println("Customer " + customerName + " not found in branch " + branchName + ".");
            }
        } else {
            System.out.println("Branch " + branchName + " does not exist on file.");
        }
    }

}
