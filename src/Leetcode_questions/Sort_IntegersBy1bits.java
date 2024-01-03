package Leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Sort_IntegersBy1bits {

    public static void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String[] args) {
        int[] arr = {10,100,1000,10000};
        int n= arr.length;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int bits=Integer.bitCount(arr[i]);
            map.put(arr[i],bits);
        }
         for(int i = 0 ; i<n ; i++){
                for(int j = i+1 ; j<n; j++){
                    if(map.get(arr[i])>map.get(arr[j])) swap(i,j,arr);
                    else if(map.get(arr[i])==map.get(arr[j])){
                        if(arr[i]>arr[j]) swap(i,j,arr);
                    }
                }
           }
        System.out.println(Arrays.toString(arr));
    }
}
