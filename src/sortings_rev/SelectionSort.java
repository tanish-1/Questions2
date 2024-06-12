package sortings_rev;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7,8,1,2};
        for(int i = 0 ; i<nums.length-1 ; i++){
            int smallest = i;
            for(int j = i+1 ; j< nums.length ; j++){
                if(nums[smallest]>nums[j]){
                    smallest =j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
