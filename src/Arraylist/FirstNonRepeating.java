package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstNonRepeating {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5,2,8,5,2));
        System.out.println(findFirstNonRepeating(al));
    }
    public static Integer findFirstNonRepeating(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean isRepeating = false;
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return list.get(i);
            }
        }
        return null;
    }
}
