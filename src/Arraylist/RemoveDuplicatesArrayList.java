package Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(3,4,4,7,8,8));
        removeDuplicates(al);
    }
    static void removeDuplicates(ArrayList<Integer> al) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < al.size(); i++) {
            for(int j = 0; j < al.size(); j++) {
                if(i != j && al.get(i) == al.get(j)) {
                    ans.add(al.get(j));
                    i++;
                }
            }
        }
        System.out.println(ans.toString());
    }
}
