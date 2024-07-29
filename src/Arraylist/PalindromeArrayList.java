package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeArrayList {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>(Arrays.asList('m', 'a', 'd', 'a', 'm'));
        System.out.println(checkPalindrome(al));
    }

    static boolean checkPalindrome(ArrayList<Character> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
