package recursion_rev;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ;i<n ;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                map.get(i);
            }
            map.put(arr[i],i);
        }
//        System.out.println(Arrays.toString(arr2));
    }
}
