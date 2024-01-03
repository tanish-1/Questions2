package Leetcode_questions;

import java.util.Arrays;

public class CanMakeArithmeticProgression {
    public static void main(String[] args) {
         int[] nums = {1,2,4};
         int n = nums.length;
          Arrays.sort(nums);
          int d = nums[1] - nums[0];
          for(int i = 1 ; i<n ; i++){
              if(nums[i] - nums[i-1]!=d){
                  System.out.println(false);
                  return;
              }
          }
        System.out.println(true);
    }
}
