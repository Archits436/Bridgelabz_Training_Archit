package BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
