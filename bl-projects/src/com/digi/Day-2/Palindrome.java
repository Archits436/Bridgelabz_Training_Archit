import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s));

    }
    public static boolean checkPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r) {
            if(s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
