package arrays;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDemo {
   static int max(int[] candies){
        int[] arr = candies.clone();
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li = new ArrayList<>();
        int max = max(candies);
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) li.add(true);
            else li.add(false);
        }
        return li;
    }
    public static void main(String[] args) {
//        int[] arr = {2,3,4,55,1};
//        int[] newarr = arr.clone();
//        Arrays.sort(newarr);
//        System.out.println(Arrays.toString(newarr));
//        System.out.println(Arrays.toString(arr));
//        if(arr[0] == 1) System.out.println(true); else System.out.println(false);

            int[] arr = {2,3,5,1,3};
            int extraCandies = 3;
//            List<Boolean> li
        System.out.println(kidsWithCandies(arr,extraCandies));


    }
}
