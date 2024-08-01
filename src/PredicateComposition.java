import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateComposition {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "programming", "predicate", "composition");
        Predicate<String> lengthGreaterThanFive = s -> s.length() > 5;
        Predicate<String> containsSubstring = s -> s.contains("o");
        Predicate<String> combinedCondition = lengthGreaterThanFive.and(containsSubstring);
        List<String> filteredStrings = strings.stream()
                .filter(combinedCondition)
                .collect(Collectors.toList());

        System.out.println("Filtered strings: " + filteredStrings);
    }
}
