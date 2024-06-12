package recursion_rev;

import java.util.Arrays;

public class SortedArray {
    static boolean sortfunc(int[] arr,int indx){
     if(indx == arr.length-1) return true;
     return arr[indx]<arr[indx+1] && sortfunc(arr,indx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,4,5};
        int[] d = arr.clone();
        Arrays.sort(d);
        System.out.println(sortfunc(arr,0));
    }
}
