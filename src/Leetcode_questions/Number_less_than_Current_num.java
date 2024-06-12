package Leetcode_questions;

import java.util.Arrays;

public class Number_less_than_Current_num {
    public static int totalSmallerFunc(int[] arr , int num){
        int count = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(num>arr[i]){
                count++;
            }
        }
        return count;
    }
    public  static int[] smallerNumbersThanCurrent(int[] nums){
        int n = nums.length;
        int count = 0;
        int[] ans = new int[n];
        for(int i = 0 ; i<n ; i++){
            count = totalSmallerFunc(nums,nums[i]);
            ans[i] = count;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
