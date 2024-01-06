package sortings.quicksort;

import java.util.Arrays;

public class QuickSort {
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr,int l , int h){
       int pivot = arr[l];
        int i = l;
        int j = h;
        while (i<j){
            do{
                i++;
            }while (arr[i]<=pivot);
            do {
                j--;
            }while (arr[j]>pivot);
            if(i<j){
                swap(arr,i,j);
            }
        }
   swap(arr,l,j);
        return j;
    }
    static void QuicksortFunc(int[] arr,int low , int high){
        if(arr.length == 1){
            System.out.println(arr[0]);
        }
        if(low<high){
            int j = partition(arr,low,high);
            QuicksortFunc(arr,low,j);
            QuicksortFunc(arr,j+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5,20};
        QuicksortFunc(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
