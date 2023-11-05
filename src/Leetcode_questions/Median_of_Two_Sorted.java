package Leetcode_questions;

import java.util.Arrays;

public class Median_of_Two_Sorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int n = nums1.length;
        int m = nums2.length;
        int[] newli = new int[n+m];
        int i = 0 , j = 0;
        int indx =0;
        while (i<n  &&  j<m){
            newli[indx++] = nums1[i];
            newli[indx++] = nums2[j];
            i++;
            j++;

        }
        while (i<n){
            newli[indx++] = nums1[i];
            i++;
        }
        while (j<m){
            newli[indx++] = nums2[j];
            j++;
        }
        int N = newli.length;
        if(N%2!=0){
            double res =  (double) (N + 1) /2;
            System.out.printf("%.5f",res);
            String res1 = String.format("%.5f",res);
            System.out.println(res1);
        } else {
            double res =  ((double) N /2+((double) N /2+1))/2;
//            System.out.printf("%.5f",res);
            String res1 = String.format("%.5f",res);
            System.out.println(res1);

        }

    }
}
