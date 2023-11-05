package Leetcode_questions;

import java.util.Arrays;
import java.util.HashSet;
import  java.util.*;

public class Intersection_oftwo_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
         ArrayList<Integer> li = new ArrayList<>();
       int indx1 = 0 , indx2 = 0;
       while(indx1<arr1.length && indx2< arr2.length){
           if(arr1[indx1]<arr2[indx2]){
               indx1++;
           } else if (arr1[indx1]>arr2[indx2]) {
               indx2++;
           } else {
               li.add(arr1[indx1]);
               indx1++;
               indx2++;
           }
       }
        System.out.println(li);
    }
}
