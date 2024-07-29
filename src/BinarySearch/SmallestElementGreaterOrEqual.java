package BinarySearch;

public class SmallestElementGreaterOrEqual {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 8, 1, 9};
        int target = 5;
        System.out.println(findSmallestGreaterOrEqual(arr, target));
    }
    public static int findSmallestGreaterOrEqual(int[] arr, int target) {
        int index = -1;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target && arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }

        return index;
    }
}
