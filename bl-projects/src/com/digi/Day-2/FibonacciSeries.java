import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series: ");
//        int n = sc.nextInt();
        int n = 3;
        System.out.println("The fibonacci series is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }

        String s = "Hello";
        if(s.contains("e")){
            System.out.println("Hi");
        }
    }
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
