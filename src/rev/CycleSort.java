package rev;

import java.util.Arrays;

public class CycleSort {
    static void swap(int i , int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] cyclicSrt(int[] arr){
       int i = 0;
       while (i< arr.length){
            int correctindx = arr[i] - 1;
            if(arr[correctindx] != arr[i]){
                swap(correctindx,i,arr);
            } else {
                i++;
            }
       }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(cyclicSrt(arr)));
    }
}
