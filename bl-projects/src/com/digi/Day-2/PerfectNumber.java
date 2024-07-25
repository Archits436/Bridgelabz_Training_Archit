import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(checkPerfectNumber(n) ? n + " is a perfect number" : n + " is not a perfect number");
    }
    static boolean checkPerfectNumber(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                al.add(i);
            }
        }
        int sum = 0;
        for(int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum == n ? true : false;
    }
}
