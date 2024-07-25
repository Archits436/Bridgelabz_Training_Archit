import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenCounter = 0;
        int oddCounter = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                evenCounter++;
            } else{
                oddCounter++;
            }
        }
        System.out.println("There are " + evenCounter + " even elements in the array");
        System.out.println("There are " + oddCounter + " odd elements in the array");
    }
}
