package sortings.mergeSort;

import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr , int l , int mid , int h){
        int i = l;
        int j = mid+1;
        int k = l;
       int[] arr2 = new int[arr.length];
        while (i<=mid && j<=h){
            if(arr[i]<arr[j]){
           arr2[k++] = arr[i++];
            } else {
                arr2[k++] = arr[j++];
            }
        }
        while (i<=mid){
            arr2[k++] = arr[i++];
        }
        while (j<=h){
            arr2[k++] = arr[j++];
        }
        for (int value = l ; value<=h ; value++){
            arr[value] = arr2[value];
        }
    }
    static void mergeSortFunc(int[] arr , int low , int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSortFunc(arr,low,mid);
            mergeSortFunc(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,2,9,6,5,3,7,4};
        mergeSortFunc(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
