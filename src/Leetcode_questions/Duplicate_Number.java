package Leetcode_questions;

import java.util.HashMap;

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int j = 0;
        while (j<n){
            if(map.containsKey(nums[j])){
                System.out.println(nums[j]);
                return;
            } else {
                map.put(nums[j], 1);
            }
            j++;
        }
        System.out.println(-1);
    }
}
