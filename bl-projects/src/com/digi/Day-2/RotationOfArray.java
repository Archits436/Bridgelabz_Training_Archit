public class RotationOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 9, 12, 18};
        int n = arr.length;
        int r = 2;
        r=r%n;
        int[] arr1 = new int[r];
        for(int i = 0; i < r; i++) {
          arr1[i]=arr[i];
        }
        for(int i=r;i<n;i++){
            arr[i-r]=arr[i];
        }
        for(int i=0;i<r;i++){
            arr[i+n-r]=arr1[i];
        }
        for(int i=0;i<n;i++){
            System.out.printf(arr[i]+" ");
        }
    }
}
