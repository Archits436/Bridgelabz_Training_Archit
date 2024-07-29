package Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(al);
    }
    static void reverse(ArrayList<Integer> al) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = al.size() - 1; i >= 0; i--) {
            ans.add(al.get(i));
        }
        System.out.println(ans.toString());
    }
}
