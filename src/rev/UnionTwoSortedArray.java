package rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class UnionTwoSortedArray {
    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> map= new  HashMap<>();
        for(int i = 0 ; i<n ; i++){
            if(!(map.containsKey(arr1[i]))){
                map.put(arr1[i],1);
            }
        }
        for (int j = 0 ; j<m ; j++){
            if(!(map.containsKey(arr2[j]))){
                map.put(arr2[j],1);
            }
        }
        for (int value : map.keySet()){
            li.add(value);
        }
        System.out.println(map);
        System.out.println(li);
        Collections.sort(li);
        return li;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = {2, 2, 2, 2, 2};
        findUnion(arr1,arr2,arr1.length,arr2.length);
    }


}
