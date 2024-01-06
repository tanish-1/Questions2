package sortings.quicksort;

import java.util.Arrays;

public class QuickRev {
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr , int l , int h){
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i<j){
            do{
                i++;
            }while (arr[i]<=pivot);  // jab tak pivot se chota ya equal h to i ko increment karte raho...aur bade milne par rukh jao
            do {
                j--;
            }while (arr[j]>pivot); // jab tak pivot se badha  h to j ko decrement karte raho...aur chota milne par rukh jao
            // now swap , after milne par
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }
    static void quickSort(int[] arr , int low , int high){
        if(low<high){
          int j = partition(arr,low,high);
          // after finding pivot position do quicksort in left side and right side
            quickSort(arr,low,j);
            quickSort(arr,j+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5,20};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
