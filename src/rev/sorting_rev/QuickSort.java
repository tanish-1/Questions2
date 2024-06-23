package rev.sorting_rev;

import java.util.Arrays;

public class QuickSort {
    static void swap(int[] arr , int val1 , int val2){
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }
    static int partition(int[] arr , int l , int h){
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
    static void  quickSort(int[] arr,int low , int high) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
        }
        if (low < high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j);
            quickSort(arr, j + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5,20};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
