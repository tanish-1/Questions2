package rev;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static void swap(int i , int j , int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i = 0;
        List<Integer> li = new ArrayList<>();
        while (i< arr.length){
            int correctindx = arr[i]-1 ;
            if(arr[correctindx] != arr[i]){
            swap(correctindx,i,arr);
            } else {
                i++;
            }
        }
        int indx = 0;
        while (indx < arr.length){
            int correctindx = indx+1 ;
            if(correctindx != arr[indx]){
                li.add(indx+1);
                indx++;
            } else {
                indx++;
            }
        }
         return li;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

}