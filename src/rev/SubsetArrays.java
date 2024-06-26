package rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetArrays {
//    static List<List<Integer>> subset(int[] arr){
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        for (int value : arr){
//            int size = outer.size();
//            for (int i = 0; i < size; i++) {
//                List<Integer> internal = new ArrayList<>(outer.get(i));
//                internal.add(value);
//                outer.add(internal);
//            }
//        }
//        return outer;
//
//    }
    static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s;
        int e = 0;
        for (int i = 0; i < arr.length ; i++) {
            s = 0;
            if(i>0 && arr[i] == arr[i-1]){
                s = e + 1;
            }
            e = outer.size() -1;
            int size = outer.size();
            for (int j = s; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;

    }
    public static void main(String[] args) {
       int[] arr = {1,2,2};
        List<List<Integer>> res = subset(arr);
        for(List<Integer> value : res){
            System.out.print(value+" ");
        }
    }
}
