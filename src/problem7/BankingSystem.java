package problem7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0);
        try {
            System.out.println("Enter the amount to withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Please enter a valid numeric value");
        } finally {
            sc.close();
        }
    }
}
