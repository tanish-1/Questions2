package Leetcode_questions;

import java.util.Arrays;

public class Flipping_img {
    public static void  flipImage(int[][] img){
        for(int i = 0 ; i<img.length ; i++){
            int sc = 0;
            int ec = img.length-1;
            while (sc<=ec){
                int temp = img[i][ec];
                img[i][ec] = img[i][sc];
                img[i][sc] = temp;
                sc++;
                ec--;
            }
        }
        for(int i = 0 ; i< img.length ; i++){
            for(int j = 0 ; j<img.length ; j++){
                if(img[i][j] == 0){
                    img[i][j] = 1;
                }else {
                    img[i][j] = 0;
                }
            }
        }

        for(int i = 0 ; i< img.length ; i++){
            for(int j = 0 ; j<img[0].length ; j++){
                System.out.print(img[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] img = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        flipImage(img);
    }
}
