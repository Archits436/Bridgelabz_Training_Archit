package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(3,5,8,1,6,5,1,3));
        printDuplicates(al);
    }

    static void printDuplicates(ArrayList<Integer> al) {
        for(int i = 0; i < al.size(); i++) {
            for(int j = 0; j < al.size(); j++) {
                if(i != j && al.get(i) == al.get(j)) {
                    System.out.println(al.get(j));
                    al.remove(al.get(j));
                }
            }
        }
    }
}
