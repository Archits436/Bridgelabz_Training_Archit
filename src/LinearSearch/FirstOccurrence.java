package LinearSearch;

import java.util.List;
import java.util.Arrays;

public class FirstOccurrence {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 30);
        int target = 30;
        System.out.println(findFirstOccurrence(numbers, target));
    }

    public static int findFirstOccurrence(List<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
