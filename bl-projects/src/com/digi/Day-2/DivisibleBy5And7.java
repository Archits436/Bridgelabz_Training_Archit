import java.util.Scanner;

public class DivisibleBy5And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(checkDivisibilityBy5And7(n) ? "The number is divisible by both 5 and 7" : "The number is not divisible by both 5 and 7");
    }

    public static boolean checkDivisibilityBy5And7(int n) {
        return (n % 5 == 0 && n % 7 == 0) ? true : false;
    }
}
