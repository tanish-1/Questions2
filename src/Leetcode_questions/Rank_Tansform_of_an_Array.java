package Leetcode_questions;

import java.util.Arrays;
import java.util.HashMap;

public class Rank_Tansform_of_an_Array {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        int n = arr.length;
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0 ; i<n ; i++){
            if(!(map.containsKey(arr2[i]))){

                map.put(arr2[i],count++);
            }
        }
       for(int i = 0 ; i<n ; i++){
           if(map.containsKey(arr[i])){
               arr[i] = map.get(arr[i]);
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
