package rev;

import java.util.HashMap;

public class SubarraySumEquals {
  static int subarraySum(String str , int[] arr , int k){
      HashMap<Integer,Integer> map = new HashMap<>();
      map.put(0,1);
     int count = 0;
      for (int i = 0; i < arr.length; i++) {
          int diff = k - arr[i];
          if(diff == 0){
              count++;
          }
          if (map.containsKey(diff)){
              count++;
          } else {
              map.put(arr[i],i);
          }


      }
      return count;
  }
    public static void main(String[] args) {
        System.out.println(subarraySum("",new int[]{1,-1,0},0));
    }
}
