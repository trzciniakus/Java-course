package CH6.ConstructorsTraining;

public class Main {



    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setBalance(1000);
        System.out.println("Your balance is " + account.getBalance());
        account.withdrawFunds(500);
        System.out.println("Your balance is " + account.getBalance());
        account.depositFunds(200);
        System.out.println("Your balance is " + account.getBalance());
        account.withdrawFunds(800);
        System.out.println("Your balance is " + account.getBalance());
        account.withdrawFunds(700);
        System.out.println("Your balance is " + account.getBalance());
        account.setBalance(253);
        System.out.println("Your balance is " + account.getBalance());
        System.out.println(account);


    }
}
