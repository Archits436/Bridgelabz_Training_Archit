package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,2,9,1,9,8,3};
        int target = 1;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
