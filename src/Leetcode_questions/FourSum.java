package Leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class FourSum {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int n = nums.length;
        Arrays.sort(nums);
        int target = 8;
        List<List<Integer>> li = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1 ; j<n ; j++){
                if(j!=i+1 && nums[j] == nums[j-1]) continue;
                int k = j +1;
                int l = n -1;
                while (k<l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum ==target){
                        ArrayList<Integer> inli = new ArrayList<>();
                        inli.add(nums[i]);
                        inli.add(nums[j]);
                        inli.add(nums[k]);
                        inli.add(nums[l]);
                        li.add(inli);
                        k++; l--;
                        while (k<l && nums[k] == nums[k-1]) k++;
                        while (k<l && nums[l] == nums[l+1]) l--;
                    } else if (sum<target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        System.out.println(li);
    }
}
