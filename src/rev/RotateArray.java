package rev;

import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] arr , int k){
        int[] res = new  int[arr.length];

        for (int i = 0 ; i< arr.length ; i++){
               int indx = (i+k)% arr.length;
               res[indx] = arr[i];

        }
        int indx = 0;
         for (int value : res){
             arr[indx++] = value;
         }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
