package rev;

import java.util.Arrays;

public class DupicateNumber {
    static void swap(int first , int second , int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i< arr.length){
            int correctindx = arr[i]-1;
            if(arr[correctindx] != arr[i]){
                swap(correctindx , i , arr);
            } else {
                i++;
            }
        }
//       return arr;
        int indx = 0;
        while (indx< arr.length){
            int correct = indx + 1;
            if(correct!=arr[indx]){
                return arr[indx];
            } else {
                indx++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
}
