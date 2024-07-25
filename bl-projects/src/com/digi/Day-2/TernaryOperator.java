import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The minimum of the two numbers is " + (a > b ? b : a));
    }
}
