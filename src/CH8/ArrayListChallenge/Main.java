package CH8.ArrayListChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = true;
        int choice = 0;
        printInstructions();
        while (quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = false;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - choice options");
        System.out.println("\t 1 - print contact list");
        System.out.println("\t 2 - add contact");
        System.out.println("\t 3 - update contact");
        System.out.println("\t 4 - remove contact");
        System.out.println("\t 5 - search for contact");
        System.out.println("\t 6 - quit");

    }

    public static void addItem() {
        System.out.println("Enter contact name:");
        String contactName = scanner.nextLine();
        System.out.println("Enter phone number:");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.addContact(contactName, phoneNumber);
    }

    public static void modifyItem() {
        System.out.println("Enter contact name you want to update:");
        String currentContactName = scanner.nextLine();
        System.out.println("Enter new contact name:");
        String newContactName = scanner.nextLine();
        System.out.println("Enter new phone number:");
        int newPhoneNumber = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.modifyContact(currentContactName, newContactName, newPhoneNumber);
    }

    public static void removeItem() {
        System.out.println("Enter contact name you want to remove:");
        String contactName = scanner.nextLine();
        mobilePhone.removeContact(contactName);
    }

    public static void searchForItem() {

        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (mobilePhone.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " not in the list");
        }

    }
}
