package rev;

import java.util.Arrays;

public class MissingNumber {

    static void swap(int i , int j , int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int missingfunc(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i< arr.length){
            int correctindx = arr[i] ;
            if(arr[i]< arr.length && arr[correctindx] != arr[i]){
                swap(correctindx,i,arr);
            } else {
                i++;
            }
        }
        // search
        for(int indx = 0 ; indx<n ; indx++){
            if(indx != arr[indx]){
                return indx;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missingfunc(arr));
    }
}
