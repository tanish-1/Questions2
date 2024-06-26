package rev;

import java.util.Arrays;

public class MissingNumber2 {
    static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,correct,i);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j = 0 ; j< arr.length ; j++){
            if(j != arr[j]){
                return j;
            }
        }

        return arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingNumber(arr));
    }

}
