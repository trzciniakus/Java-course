package CH11.ScopeChallenge;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter integer: ");
        X x = new X(scanner.nextInt());
        scanner.nextLine();
        x.x();

    }
}
