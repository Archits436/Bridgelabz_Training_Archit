import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximum value in the array is " + max);
        System.out.println("The minimum value in the array is " + min);
    }
}
