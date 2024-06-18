package rev.sorting_rev;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSrt(int[] arr){
        for(int i = 0 ; i< arr.length ; i++){
            int smallest = i;
            for (int j = i+1 ; j< arr.length ; j++){
                if(arr[smallest]>arr[j]){
                  smallest = j;
                }
            }
             int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,2};
        System.out.println(Arrays.toString(selectionSrt(arr)));
    }
}
