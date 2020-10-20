package CH5_ConstructorsTraining;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){

    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (double amount){
        this.balance += amount;
        System.out.println("You deposit " + amount + ". Your account balance is " + this.balance + ".");
    }

    public void withdrawFunds (double amount){
        if (amount <= this.balance){
            this.balance -= amount;
            System.out.println("You withdrawed " + amount + ". Your account balance is " + this.balance + ".");
        } else {
            System.out.println("Your account balance is not enough to perform this operation");
        }

    }
}
