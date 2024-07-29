package LinearSearch;

public class FirstNonDuplicate {
    public static void main(String[] args) {
        String text = "swiss";
        System.out.println(findFirstNonDuplicate(text));
    }
    public static char findFirstNonDuplicate(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && current == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                return current;
            }
        }
        return '\0';
    }
}
