package Leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int n = nums.length;
        int target = 0;
        Arrays.sort(nums);
        ArrayList<Integer> li = new ArrayList<>();
         for(int i = 0 ; i<n-3 ; i++){
            int l = i+1;
            int h = nums.length -1;
            int sh = n - i - 1;
            while (l<=h){
                int sum = nums[i] + nums[l] + nums[sh] + nums[h];
                if(sum == target){
                    li.add(nums[i] );
                    li.add(nums[l] );
                    li.add(nums[sh] );
                    li.add(nums[h] );
                    l++;
                    h--;
                }
                if(nums[l]+nums[h]>0){
                    h--;
                } else {
                    l++;
                }
            }
        }
    }
}
