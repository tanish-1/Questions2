package sortings.bubblesort;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    static void BubbleSortFunc(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i<n-1 ; i++){
            for (int j = 0;j<n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-2, 45, 0, 11, -9 };
        BubbleSortFunc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
