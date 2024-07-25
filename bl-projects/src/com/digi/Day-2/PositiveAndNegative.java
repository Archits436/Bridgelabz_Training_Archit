import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int neg = 0;
        int pos = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0) {
                pos++;
            } else {
                neg++;
            }
        }
        int[] posArr = new int[pos];
        int[] negArr = new int[neg];
        int i = 0;
        int j = 0;
        for(int k = 0; k < n; k++){
            if(arr[k] >= 0) {
                posArr[i] = arr[k];
                i++;
            } else {
                negArr[j] = arr[k];
                j++;
            }
        }

        System.out.println("The positive and negative arrays are: ");
        for(i = 0; i < posArr.length; i++) {
            System.out.print(posArr[i] + " ");
        }
        System.out.println();
        for(i = 0; i < negArr.length; i++) {
            System.out.print(negArr[i] + " ");
        }
    }
}
