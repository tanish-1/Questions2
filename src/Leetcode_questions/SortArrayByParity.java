package Leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        Arrays.sort(nums);
        ArrayList<Integer> evenli = new ArrayList<>();
        ArrayList<Integer> oddli = new ArrayList<>();
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]%2==0){
                evenli.add(nums[i]);
            } else {
                oddli.add(nums[i]);
            }
        }
         evenli.addAll(oddli);
        System.out.println(evenli);
        int[] res = new int[evenli.size()];

        for(int indx = 0; indx < evenli.size(); indx++){
            res[indx] = evenli.get(indx);
        }
        System.out.println(Arrays.toString(res));
    }
}
