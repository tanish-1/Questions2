package rev;

import java.util.Arrays;

public class CycleSort2 {
    static void swap(int first , int second , int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cyclicsrt(int[] arr){
       int i = 0;
       while(i<arr.length){
           int correctindx = arr[i];
           if(arr[i]< arr.length && arr[correctindx] != arr[i]){
               swap(correctindx , i , arr);
           } else {
               i++;
           }
       }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,0};
        cyclicsrt(arr);
        System.out.println(Arrays.toString(arr));
    }
}
