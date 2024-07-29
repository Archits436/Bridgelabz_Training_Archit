package Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoLists {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(3,2,4,7,8));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(3,1,4,7,9));
        findUnion(al1, al2);
    }

    static void findUnion(ArrayList<Integer> al1, ArrayList<Integer> al2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < al1.size(); i++) {
            ans.add(al1.get(i));
        }
        for(int i = 0; i < al2.size(); i++) {
            if(!ans.contains(al2.get(i))) {
                ans.add(al2.get(i));
            }
        }
        System.out.println(ans.toString());
    }
}
