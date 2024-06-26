package rev;

import java.util.HashMap;

public class SubarraySumEqualsK {
    static int subarraySum(int[] arr , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
//        for (int i = 0 ; i<arr.length ; i++){
//            if()
//            int diff = k - arr[i];
//            if(map.containsKey(diff)){
//
//
//            } else {
//                map.put(arr[i],i);
//            }
//        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k =2;
        System.out.println(subarraySum(arr,k));
    }
}
