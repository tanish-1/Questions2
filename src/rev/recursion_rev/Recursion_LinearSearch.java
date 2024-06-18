package rev.recursion_rev;

import java.util.ArrayList;

public class Recursion_LinearSearch {
//    static boolean searchFunc(int[] arr , int target,int indx){
//        if(indx==arr.length) return false;
//       return (arr[indx] == target) ||  searchFunc(arr , target , indx+1);
//    }
    static ArrayList<Integer>  searchFunc(int[] arr , int target, int indx, ArrayList<Integer> li){
        if(indx==arr.length) return li;
        if(arr[indx] == target){
            li.add(indx);
        }
          return  searchFunc(arr , target , indx+1,li);

    }
    static ArrayList<Integer>  searchFunc(int[] arr , int target, int indx){
        ArrayList<Integer> li = new ArrayList<>();
        if(indx==arr.length) return li;
        if(arr[indx] == target){
            li.add(indx);
        }
        ArrayList<Integer> ans = searchFunc(arr , target , indx+1,li);
        li.addAll(ans);
        return  li;

    }
    public static void main(String[] args) {
        System.out.println(searchFunc(new int[]{3,2,1,18,9},18, 0,new ArrayList<>()));
    }
}
