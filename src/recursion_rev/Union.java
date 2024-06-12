package recursion_rev;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Union {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 3};
        int[] arr = {2, 2, 4};
//        ArrayList<Integer> li = new ArrayList<>();
//        for(int i = 0 , j = 0 ; i< arr.length && j< arr2.length ; i++ , j++){
//            if(li.contains(arr[i])) {
//                continue;
//            }
//            li.add(arr[i]);
//             if (li.contains(arr2[j])) {
//                continue;
//            }
//            li.add(arr2[j]);
//        }
//        for (int i = 0 ; i<arr.length ; i++){
//            if(li.contains(arr[i])) {
//                continue;
//            }
//            li.add(arr[i]);
//        }
//        for (int j = 0 ; j< arr2.length ; j++){
//            if (li.contains(arr2[j])) {
//                continue;
//            }
//            li.add(arr2[j]);
//        }
//        Collections.sort(li);
//        System.out.println(li);
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        for (int num : map.keySet()){
             if(map.get(num) == 1){
                 System.out.println(num);
             }
        }
    }
}
