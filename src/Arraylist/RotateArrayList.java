package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int n = 2;
        rotate(al, n);
    }
    static void rotate(ArrayList<Integer> al, int n) {
        if(al.size() == 0) {
            return;
        }
        n = n % al.size();
        Collections.rotate(al, n);
        System.out.println(al.toString());
    }
}
