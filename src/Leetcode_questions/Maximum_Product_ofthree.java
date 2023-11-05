package Leetcode_questions;

import java.util.Arrays;

public class Maximum_Product_ofthree {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3};
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length-2 ; i++){
            int low = i+1;
            int high = arr.length-1;
            while(low<=high ){
                int p = arr[i]*arr[low]*arr[high];
                max = Math.max(max,p);
                if (arr[low] * arr[high] > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        System.out.println(max);
    }
}
