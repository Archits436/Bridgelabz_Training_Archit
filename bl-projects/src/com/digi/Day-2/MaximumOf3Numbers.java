import java.util.Arrays;
import java.util.Scanner;

public class MaximumOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The maximum of the three numbers is " + arr[2]);
    }
}
