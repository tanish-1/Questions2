package Leetcode_questions;

public class Search_in_Rotated_array_2 {
    public static void main(String[] args) {
      int[] arr = {1,0,1,1,1};
      int target = 0;
        int low = 0 ,  high = arr.length -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(target == arr[mid]){
                System.out.println(true);
                return;
            }
            if(arr[low] == arr[mid] && arr[mid]== arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high = mid -1;
                } else{
                    low = mid + 1;
                }
            } else{
                if(arr[mid]<=target && target<=arr[high]){
                    low = mid +1;
                } else{
                    high = mid - 1;
                }
            }
        }
        System.out.println(false);
    }
}
