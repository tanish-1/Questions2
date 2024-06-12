package rev;

import java.util.HashMap;

public class MajorityEle {
    static int majorityElement(int[] nums){
        int count = 0;
        int ele = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(count <= 0){
                count = 1;
                ele = nums[i];
            } else if(ele == nums[i]){
                count++;
            } else {
                count--;
            }

        }
        return ele;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        HashMap<Integer ,Integer> map = new HashMap<>();

        System.out.println(majorityElement(arr));
    }
}
