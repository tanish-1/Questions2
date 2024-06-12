package recursion_rev;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int indx = (i + k) % arr.size();
            li.add(arr.get(indx));
        }
        System.out.println(li);

//        int[] arr = new int[nums.length];
//        for(int i = 0 ;i<nums.length ; i++){
//            int indx = (i+k)%nums.length;
//            arr[indx] = nums[i];
//        }
//        System.out.print(Arrays.toString(arr));

     }
}
