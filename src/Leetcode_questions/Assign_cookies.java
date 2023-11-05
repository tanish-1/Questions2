package Leetcode_questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Assign_cookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {3};
        Arrays.sort(g);
        Arrays.sort(s);
//        int gl = g.length, sl = s.length;
        int i = 0;
        int j = 0;
        int n1 = g.length, n2 = s.length;
        int count = 0;
        while(i<n1 && j<n2){
            if(s[j]>=g[i]){
                count++;
            i++;
            j++;
            } else {
                j++;
            }
        }
        System.out.println(count);
//        ArrayList<Integer>
//        HashSet<Integer> set = new HashSet<>()
    }
}
