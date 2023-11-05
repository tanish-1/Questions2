package Leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Square_of_aSorted {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int n = nums.length;
        int left = 0;
        int right = nums.length -1;
        int index = nums.length- 1;
        int result[] = new int [nums.length];
        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                result[index] = nums[left] * nums[left];
                left++;
            }
            else
            {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        System.out.println(Arrays.toString(nums));
//        for(int i = 0 ; i<n-1 ; i++){
//
//            if(arr[i]>arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//
//        }
//        int temp = arr[0];
//        arr[0]= arr[1];
//        arr[1]=temp;

//        System.out.println(Arrays.toString(arr));
//        ArrayList<Integer> li = new ArrayList<>();
//        for(int i = 0 ; i<n ; i++){
//              li.add(Math.abs(arr[i]*arr[i]));
//        }
//        Collections.sort(li);
//        int[] res = new int[li.size()];
//        int indx = 0;
//        for(int val : li){
//            res[indx++] = val;
//        }
//        System.out.println(Arrays.toString(res));
    }
}
