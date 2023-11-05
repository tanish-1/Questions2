package Leetcode_questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Height_checker {
    public static void main(String[] args) {
        int[] height = {1,2,3,4,5};
        int n = height.length;
        int[] expected  = height.clone();
         Arrays.sort(expected);
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(height));
        int count = 0;
        for(int i = 0 ;i<n ; i++){
            if(height[i] != expected[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
