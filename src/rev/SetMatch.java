package rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatch {
    static void swap(int first , int second , int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int[] findError(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correctindx = arr[i]-1;
            if(arr[correctindx] != arr[i]){
                swap(correctindx , i , arr);
            } else {
                i++;
            }
        }
        int indx = 0;
        int[] res = new int[2];
        while (indx < arr.length) {
            int correctindx = indx+1;
            if (correctindx != arr[indx]) {
                res[0] = arr[indx];
                 res[1] = indx+1;
                 indx++;
            } else {
                indx++;
            }
        }
        return res;
    }
        public static void main(String[] args) {
        int[] arr = {4,2,2,1};
            System.out.println(Arrays.toString(findError(new int[]{4,2,2,1})));
    }
}
