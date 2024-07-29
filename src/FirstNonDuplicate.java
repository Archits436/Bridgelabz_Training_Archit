import java.util.*;

public class FirstNonDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        Integer firstNonDuplicate = findFirstNonDuplicate(numbers);
        System.out.println("First non-duplicate element: " + firstNonDuplicate);
    }

    public static Integer findFirstNonDuplicate(List<Integer> numbers) {
        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer number : numbers) {
            if (!duplicates.contains(number)) {
                if (!seen.add(number)) {
                    seen.remove(number);
                    duplicates.add(number);
                }
            }
        }

        return seen.iterator().hasNext() ? seen.iterator().next() : null;
    }
}
