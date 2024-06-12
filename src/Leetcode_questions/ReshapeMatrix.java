package Leetcode_questions;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2},
                {3,4}
          };
        int r = 1;
        int c = 4;
        int innerrow = 0, innercol = 0;
        int[][] ans = new int[r][c];
        while (innerrow<r || innercol<c){

        for(int i = 0  ; i< mat.length  ; i++){
            for(int j = 0  ; j< mat.length ; j++){
                ans[innerrow++][innercol++] = mat[i][j];
            }

        }
        }
        for(int i = 0 ;i<ans.length ; i++){
            for (int j = 0 ; j< ans.length ; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
