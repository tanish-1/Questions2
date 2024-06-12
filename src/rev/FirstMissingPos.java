package rev;

import java.util.Arrays;

public class FirstMissingPos {
    static void swap(int i , int j , int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int firstMissingPositive(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i< arr.length){
            int correctindx = arr[i]-1;
            if(arr[i]>0 && arr[i] <= arr.length && arr[correctindx] != arr[i]){
                swap(correctindx,i,arr);
            } else {
                i++;
            }
        }

        for(int indx = 0 ; indx<n ; indx++){
            if(indx+1 != arr[indx]){
                return indx+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
}
