package Recursion_ques;

public class isSorted {
    public  static  boolean SortedFunc(int[] arr , int i){
        if(i == arr.length -1){
            return true;
        }
        return  arr[i]<arr[i+1] && SortedFunc(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,12};
        System.out.println(SortedFunc(arr,0));
    }
}
