package Leetcode_questions;

import java.util.Arrays;

public class CountNumbersmallerthanCurrentN {
    public  static int smallerNumbers(int val , int[] arr){
        int count = 0;
        for(int ele : arr){
            if(val>ele) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int n = nums.length;
        int[] clonenums = nums.clone();
        for(int i = 0 ; i<n ; i++){
            clonenums[i] = smallerNumbers(nums[i],nums);
        }
        System.out.println(Arrays.toString(clonenums));
        int[] arr = {1,1,1,1,1,1,1};
        int i = arr.length-1;
        int sum = 0;
        for(int j = 0 ; j< arr.length ; j++){
            sum+=(int)Math.pow(2,i)*arr[j];
            i--;
        }
        System.out.println(sum);
        System.out.println(Integer.bitCount(127));
    }
}
