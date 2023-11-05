package Leetcode_questions;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Minimum_Absolue_Difference {
    public static void main(String[] args) {
        int[] arr = {40,11,26,27,-20};
        int n = arr.length;
        Arrays.sort(arr);
        int i=0 , j = arr.length-1;
        int min = Integer.MAX_VALUE;
        List<List<Integer>> li = new ArrayList<>();
        while(i<j){
            int diff = arr[i+1] - arr[i];
            if(min>diff){
                min = diff;
                 li = new ArrayList<>();
              li.add(Arrays.asList(arr[i],arr[i+1]));

            } else if (min == diff) {
                li.add(Arrays.asList(arr[i],arr[i+1]));
            }
            i++;
        }
        System.out.println(li);
//         Truncate the newli array to remove any unused rows
//        int[][] res = Arrays.copyOf(newli,indx);
//        System.out.println(Arrays.deepToString(res));
    }
}
