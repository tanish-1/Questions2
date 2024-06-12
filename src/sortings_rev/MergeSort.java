package sortings_rev;

import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr, int low , int mid , int high){
        int i = low;
        int j = mid+1;
        int k = low;
        int[] arr2 = new int[arr.length];
        while (i<=mid && j<=high){
            if(arr[i]<arr[j]){
                arr2[k++] = arr[i++];
            } else {
                arr2[k++] = arr[j++];
            }
        }
        while (i<=mid){
            arr2[k++] = arr[i++];
        }
        while (j<=high){
            arr2[k++] = arr[j++];
        }
        for (int val = low ; val<=high ; val++){
            arr[val] = arr2[val];
        }
    }

    static void mergeSortFunc(int[] arr , int l, int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSortFunc(arr,l,mid);
            mergeSortFunc(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    public static void main(String[] args) {
        int[] nums = {7,8,3,1,2};
        mergeSortFunc(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
