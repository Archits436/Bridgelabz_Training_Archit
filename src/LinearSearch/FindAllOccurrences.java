package LinearSearch;

import java.util.ArrayList;
import java.util.List;

public class FindAllOccurrences {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;

        System.out.println(findAllIndices(numbers, target));
    }

    public static List<Integer> findAllIndices(int[] array, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indices.add(i);
            }
        }
        return indices;
    }
}
