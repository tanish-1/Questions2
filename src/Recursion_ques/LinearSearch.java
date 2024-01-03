package Recursion_ques;

public class LinearSearch {
    public static boolean Searchfunc(int[] arr , int target , int i){
        if(i == arr.length){
            return false;
        }
        return arr[i] == target || Searchfunc(arr,target,i+1);
    }
    public static int  SearchIndex(int[] arr , int target , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        } else {
        return SearchIndex(arr,target,i+1);
        }
    }
    public static void main(String[] args) {
         int[] arr = {3,2,1,18,9};
         int target = 18;
        System.out.println(Searchfunc(arr,target,0));
        System.out.println(SearchIndex(arr,target,0));
    }
}
