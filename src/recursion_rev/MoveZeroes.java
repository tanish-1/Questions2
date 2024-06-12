package recursion_rev;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
         int[] arr = new int[nums.length];
         int indx = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] != 0){
                arr[indx++] = nums[i];
            }
        }
        for(int i = 0 ; i< arr.length ; i++){
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
