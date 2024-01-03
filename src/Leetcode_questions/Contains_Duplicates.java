package Leetcode_questions;

import java.util.HashMap;
import java.util.Scanner;

public class Contains_Duplicates {
    public static void main(String[] args) {
        int[] arr = {2,14,18,22,22};
//        Scanner sc = Scanner
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<n ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)>=2){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
