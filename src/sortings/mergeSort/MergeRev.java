package sortings.mergeSort;

public class MergeRev {
    static void merge(int[] arr , int low ,int mid , int high){
         int i = low;
         int j = mid + 1;
         int k = low;
         int[] nums = new int[arr.length];
         while (i<=mid && j<=high){
             if(arr[i]<=arr[j]){
                 nums[k++] = arr[i++];
             } else {
                 nums[k++] = arr[j++];
             }
         }
         while (i<=mid){
             nums[k++] = arr[i++];
         }
         while (j<=high){
             nums[k++] = arr[j++];
         }
//         copy  elements into original array
        for(int value = low ; value<=high ; value++){
            arr[value] = nums[value];
        }
    }
    static void mergesort(int[] arr, int low , int high){
        if(low<high){
            int mid = (low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,2,9,6,5,3,7,4};
        mergesort(arr,0,arr.length-1);
    }
}
