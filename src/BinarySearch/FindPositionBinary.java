package BinarySearch;

public class FindPositionBinary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(findPositionBinary(arr, target));
    }

    static int findPositionBinary(int[] arr, int target) {
        int l = 0;
        int r = arr.length;
        while(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
