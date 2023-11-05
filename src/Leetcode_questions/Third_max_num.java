package Leetcode_questions;

import java.util.Arrays;

public class Third_max_num {
    public static void func(int[] nums){
        int n = nums.length;
        int count = 1;
                if(nums[0] == nums[n-1] ){
                    System.out.println(nums[0]);

                }
            for(int i = n-1 ; i>=0 ; i--){
                if(nums[i] > nums[i-1]){
                    count++;
                } else if (nums[i] == nums[i-1]) {
                    continue;
                }
                if (count == 3){
                    System.out.println(nums[i-1]);
                    return;
                }
            }

    }
    public static void main(String[] args) {
        int[] nums = {3,3,4,3,4,3,0,3,3};
        Arrays.sort(nums);
        func(nums);
    }
}
