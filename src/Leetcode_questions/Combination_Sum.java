package Leetcode_questions;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static List<List<Integer>> combinationFunc(int[] arr, int target,List<List<Integer>> li,List<Integer> innerli,int start){
        if(target ==0){
            li.add(new ArrayList<>(innerli));
            return li;
        }
        if(target<0){
            return li;
        }
        for(int i = start ; i<arr.length ; i++){
            innerli.add(arr[i]);
            combinationFunc(arr, target-arr[i], li, innerli, i);
            innerli.remove(innerli.size()-1);
        }
        return li;
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> li = new ArrayList<>();
        System.out.println(combinationFunc(candidates,target,li,new ArrayList<>(),0));
    }
}
