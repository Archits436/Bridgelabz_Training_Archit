package BinarySearch;

public class LargestElementSmallerOrEqual {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 8, 1, 9};
        int target = 5;
        System.out.println(findLargestLessOrEqual(arr, target));
    }
    public static int findLargestLessOrEqual(int[] arr, int target) {
        int index = -1;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target && arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }
        return index;
    }
}
