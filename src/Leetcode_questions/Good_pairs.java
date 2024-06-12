package Leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Good_pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int n = nums.length;
        int ans = 0, cnt[] = new int[101];
        for (int a: nums) {
            ans += cnt[a]++;
        }
        System.out.println(ans);
//        int count = 0;
//       List<List<Integer>>  li = new ArrayList<>();
//        for(int i = 0 ; i<n ; i++){
//            for(int j = i+1 ; j<n ; j++){
//                if(nums[i] == nums[j]){
//                    li.add(Arrays.asList(i,j));
//                    count++;
//                }
//            }
//        }
//        System.out.println(li+""+count);
    }
}
