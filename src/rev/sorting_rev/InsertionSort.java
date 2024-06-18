package rev.sorting_rev;

import java.util.Arrays;

public class InsertionSort {
    static int[] insertionSrt(int[] arr){
        for(int i = 1 ; i< arr.length ; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        System.out.println(Arrays.toString(insertionSrt(arr)));
    }
}
