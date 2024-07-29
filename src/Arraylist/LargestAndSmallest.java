package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestAndSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5,2,8,1,3));
        Collections.sort(al);
        System.out.println(al.get(0));
        System.out.println(al.get(al.size() - 1));
    }
}
