package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(3,2,4,7,8));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(3,1,4,7,9));
        printCommonElements(al1, al2);
    }
    static void printCommonElements(ArrayList<Integer> al1, ArrayList<Integer> al2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < al1.size(); i++) {
            for(int j = 0; j < al2.size(); j++) {
                if(al1.get(i) == al2.get(j)) {
                    ans.add(al2.get(j));
                }
            }
        }
        System.out.println(ans.toString());
    }
}
