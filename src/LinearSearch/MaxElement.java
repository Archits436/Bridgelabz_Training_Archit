package LinearSearch;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {4,2,8,7,1,5};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
