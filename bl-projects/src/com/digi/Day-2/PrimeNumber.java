import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(checkPrime(n) ? n + " is a prime number" : n + " is not a prime number");
    }
    static boolean checkPrime(int n) {
        if(n < 1) {
            return false;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                al.add(i);
            }
        }
        return al.size() == 2 ? true : false;
    }
}
