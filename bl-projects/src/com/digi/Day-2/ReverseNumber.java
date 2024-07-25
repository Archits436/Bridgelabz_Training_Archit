import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int backup = n;
        int nod = 0;
        int ans = 0;
        while(n > 0) {
            nod++;
            n /= 10;
        }
        n = backup;
        while (n > 0) {
            int digit = n % 10;
            ans += digit * Math.pow(10, nod - 1);
            nod--;
            n /= 10;
        }
        System.out.println(ans);
    }
}
