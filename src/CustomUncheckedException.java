import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomUncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if(n < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed");
            }
            System.out.println("You entered " + n);
        } catch (NegativeNumberException e) {
            System.out.println("NegativeNumberException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Please enter a valid integer");
        } finally {
            sc.close();
        }
    }
}
