import java.util.*;

public class SortedUniqueElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 2, 9, 1, 2, 9);
        Set<Integer> treeSet = new TreeSet<>(numbers);

        System.out.println("TreeSet: " + treeSet);
    }
}
