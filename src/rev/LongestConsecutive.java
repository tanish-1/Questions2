package rev;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutive {
  static int longestConsecutive(int[] arr, int n){
      int count = 1;
      int maxCount = 1;

      for (int i = 1 ; i<n ; i++){
          if(arr[i] == arr[i-1]){
              continue;
          } else if (arr[i] - arr[i-1] == 1) {
              count++;
          } else {
              count = 1;
          }
          maxCount = Math.max(maxCount, count);
      }
      return maxCount;
  }
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(longestConsecutive(arr,arr.length));
    }
}
