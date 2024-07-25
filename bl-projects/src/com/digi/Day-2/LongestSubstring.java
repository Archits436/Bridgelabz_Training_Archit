import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(longestSubstring(s));
    }

    public static int longestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int[] lastIndex = new int[256];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            start = Math.max(start, lastIndex[ch] + 1);
            maxLength = Math.max(maxLength, i - start + 1);
            lastIndex[ch] = i;
        }

        return maxLength;
    }
}
