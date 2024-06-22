package rev.sorting_rev;

import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr, int l , int mid , int h){
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] res = new int[arr.length];
        while (i<=mid && j<=h){
            if(arr[i]<arr[j]){
                res[k++] = arr[i++];
            } else {
                res[k++] = arr[j++];
            }
        }
       for(;i<=mid; i++){
            res[k++] = arr[i];
        }
        for(;j<=h; j++){
            res[k++] = arr[j];
        }
        for(int indx = l ; indx<=h ; indx++){
            arr[indx] = res[indx];
        }
    }
    public static void mergeSort(int[] arr , int l , int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    public static void main(String[] args) {
     int[] arr = {3,7,5,7,6,4,8,2};
      mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
