package Leetcode_questions;

public class Minimum_in_Rotated_Arr {
    public  static  int findMin(int[] arr){
//        if(arr.length == 1){
//            return arr[0];
//        }
//        if(arr[0]>arr[1]){
//            return arr[1];
//        }
        int n = arr.length-1;
        int j = 0;
        int i = 0;
        int res = Integer.MAX_VALUE;
        while(j<=n){
            int ni = (j+n)%n;
            if(arr[ni]>arr[i]){
                j++;
                continue;
            } else if(arr[ni]<arr[i]){
                return arr[j];
            }
            j++;
        }
        return arr[i];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1};
        System.out.println(findMin(arr));
    }
}
