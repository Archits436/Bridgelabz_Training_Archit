import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 5, 1, 2);

        Set<Integer> hashSet = new HashSet<>(numbers);
        System.out.println("HashSet: " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(numbers);
        System.out.println("TreeSet: " + treeSet);
    }
}