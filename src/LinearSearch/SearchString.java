package LinearSearch;

public class SearchString {
    public static void main(String[] args) {
        String[] arr = {"bluee", "is", "blue"};
        String target = "blue";
        System.out.println(searchString(arr, target));
    }
    public static int searchString(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
