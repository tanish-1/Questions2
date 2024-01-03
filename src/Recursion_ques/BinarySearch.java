package Recursion_ques;

public class BinarySearch {
    public static  int  Bfunc(int[] nums , int target,int i , int j){
        int ans = -1;
        if(i>j){
          return -1;

        }
        int mid = i + (j-i)/2;
        if(nums[mid] == target){
           ans = mid;
        }else if(nums[mid]<target){
            ans = Bfunc(nums,target,mid+1, j);
        } else if (nums[mid]>target) {
            ans = Bfunc(nums,target,i,mid-1);
        }
      return  ans;
    }
    public static void main(String[] args) {
          int[] nums = {-1,0,3,5,9,12};
          int target = 2;
        System.out.println(Bfunc(nums,target,0,nums.length-1));
    }
}
