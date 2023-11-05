package Leetcode_questions;

import java.util.Arrays;

public class Largest_Perimeter_triangle {
    public static void main(String[] args) {
        int[] arr = {1,2,1,10};
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0 , max = 0;
        for(int i = 0 ; i<n-1 ; i++){
            for(int j = i+2 ; j<n ; j++){
                if(arr[i]+arr[i+1]>arr[j]){
                    sum = arr[i]+arr[i+1] + arr[j];
                    max = Math.max(max,sum);
                }
            }
            sum = 0;
        }
        System.out.println(max);
    }
}
