package CH8.ArrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void printContactList() {
        System.out.println("You have " + contactList.size() + " items in your list");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("Contact " + (i + 1) + ":");
            System.out.println("\tName: " + contactList.get(i).getContactName());
            System.out.println("\tPhone Number: " + contactList.get(i).getPhoneNumber() + "\n");
        }
    }

    public void addContact(String contactName, int phoneNumber) {
        Contact newContact = new Contact(contactName, phoneNumber);
        contactList.add(newContact);
    }

    public void modifyContact(String currentContactName, String newContactName, int newPhoneNumber) {
        int position = findContactPosition(currentContactName);
        System.out.println("position "+ position);
        modifyContact(position, newContactName, newPhoneNumber);
    }

    private void modifyContact(int position, String newContactName, int newPhoneNumber) {
        contactList.get(position).setContactName(newContactName);
        contactList.get(position).setPhoneNumber(newPhoneNumber);
    }

    public void removeContact(String contactName) {
        int position = findContactPosition(contactName);
        System.out.println("position "+ position);
        removeContact(position);
    }

    private void removeContact(int position) {
        contactList.remove(position);
    }

    public int findContactPosition(String contactName) {
        for (int i = 0; i < contactList.size();i++){
            String nameFromList = contactList.get(i).getContactName();
            if(nameFromList == contactName){
                return i;
            }
        }
        return -1;
    }

    public boolean onFile(String searchItem) {
        int position = findContactPosition(searchItem);
        return position >= 0;
    }
}
