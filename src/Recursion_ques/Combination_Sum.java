package Recursion_ques;
import java.util.*;

public class Combination_Sum {
    static  List<List<Integer>> CombinationFunc(int[] arr , int t, List<List<Integer>> li ,   List<Integer> innerli, int start){
        if(t == 0){
            li.add(new ArrayList<>(innerli));
            return li;
        }
        if(t<0){
            return li;
        }
        for(int i = start ; i<arr.length ; i++) {
            innerli.add(arr[i]);
           CombinationFunc(arr,t-arr[i],li ,new ArrayList<>(innerli),i);
            innerli.remove(innerli.size()-1);
        }
        return li;
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> li = new ArrayList<>();
        System.out.println(CombinationFunc(candidates, target,li,new ArrayList<>(),0));
    }
}
