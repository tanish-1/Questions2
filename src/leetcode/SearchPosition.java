package leetcode;

public class SearchPosition
{
    public static  int sFunc(int[] arr , int target , int i , int j){
        if(i>j){
            return i;
        }
        int mid = i + (j-i)/2;
        if(arr[mid] == target){
            return  mid;
        } else if(arr[mid]<target){
       return  sFunc(arr , target , mid+1,j);
        } else {
            return sFunc(arr, target, i, mid - 1);
        }
    }
    public static int searchInsert(int[] arr , int target){
        return sFunc(arr , target , 0 , arr.length-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums , target));
    }
}
