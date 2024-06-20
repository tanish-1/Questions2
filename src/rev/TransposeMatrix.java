package rev;

import java.util.Arrays;

public class TransposeMatrix {
   static int[][] transpose(int[][] arr){
       int[][] res = new int[arr[0].length][arr.length];
        for(int i = 0 ; i< arr.length ; i++){
            int j = 0;
            while (j< arr[0].length){
               res[j][i] = arr[i][j];
                j++;
            }
        }
        for (int[] value : res){
            for (int ele : value){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}

        };
        for (int i = 0 ; i<arr.length ; i++){
            for (int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        System.out.println(Arrays.toString(transpose(arr)));
    }
}
