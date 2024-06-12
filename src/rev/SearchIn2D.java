package rev;

import java.util.Arrays;

public class SearchIn2D {
    static int[] searchfunc(int[][] arr , int val){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
               if(arr[i][j] == val){
                 return new int[]{i,j};
               }
            }
        }
        return new int[]{-1,-1};
    }
    static int searchfunc(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] i : arr){
            for(int j  : i){
               if(j > max){
                 max = j;
               }
            }
        }
        return max;
    }
    public static void main(String[] args) {
    int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
    };

//        System.out.println("Found at Row and Col of " + Arrays.toString(searchfunc(arr,99)));
//        System.out.println("Max Value " + Arrays.toString(searchfunc(arr)));
    }
}
