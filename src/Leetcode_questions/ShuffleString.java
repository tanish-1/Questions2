package Leetcode_questions;

import java.util.Arrays;
import java.util.HashMap;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indx = {4,5,6,7,0,2,1,3};
        char[] arr = new char[indx.length];
        for(int i = 0 ; i<indx.length ; i++){
           arr[indx[i]] = s.charAt(i);
        }
String res = new String(arr);
        System.out.println(res);
//        System.out.println(map);
    }
}
