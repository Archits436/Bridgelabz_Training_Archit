package LinearSearch;

public class CountOccurrences {
    public static void main(String[] args) {
        String text = "hello world";
        char target = 'l';

        System.out.println(countCharacterOccurrences(text, target));
    }

    public static int countCharacterOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
