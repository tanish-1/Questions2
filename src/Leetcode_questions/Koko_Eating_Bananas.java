package Leetcode_questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Koko_Eating_Bananas {
    public static int Max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public  static  int func(int[] arr , int hour){
        double sum =0;
        for(int val : arr){
            sum+=Math.ceil((double) val/(double) hour);
        }
        return (int) sum;
    }
    public  static int minEatingSpeed(int[] arr , int hour){
        int low = 0 , high = Max(arr);
        while(low<=high){
            int mid = low + (high - low)/2;
            int th = func(arr,mid);
            if(th<=hour){
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int hour = 6;
        System.out.println(minEatingSpeed(arr,hour));
//        System.out.println(Math.ceil((double)3/(double)2));
    }
}
