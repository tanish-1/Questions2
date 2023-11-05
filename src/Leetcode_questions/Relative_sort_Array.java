package Leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Relative_sort_Array {
    public static void main(String[] args) {
    int[] arr1 = {28,6,22,8,44,17};
    int[] arr2 = {22,28,8,6};
    int n2 = arr2.length;
    LinkedHashMap<Integer,Integer> map = new  LinkedHashMap<>();
    ArrayList<Integer> li = new ArrayList<>();
    for(int i = 0 ; i<n2 ; i++){
        if(!(map.containsKey(arr2[i]))){
            map.put(arr2[i],0);
        }
    }
        Arrays.sort(arr1);
        int n = arr1.length;
        for(int i = 0 ; i<n ; i++){
            if(map.containsKey(arr1[i])){
              map.put(arr1[i], map.get(arr1[i])+1);
            } else {
                map.put(arr1[i], 1);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                resultList.add(key);
            }
        }

        int[] res = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            res[i] = resultList.get(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
