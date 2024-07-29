import java.util.*;

public class MaintainingInsertionOrder {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange");

        Set<String> linkedHashSet = new LinkedHashSet<>(strings);

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
