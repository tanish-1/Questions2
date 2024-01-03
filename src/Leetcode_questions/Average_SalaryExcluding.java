package Leetcode_questions;

import java.util.Arrays;

public class Average_SalaryExcluding {
    public static int Sum_func(int[] arr){
        int sum = 0;
        for(int val : arr){
            sum+=val;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] salary = {1000,2000,3000};
        int n = salary.length;
        Arrays.sort(salary);
       int res = Sum_func(salary);
       int min = salary[0] , high = salary[n-1];
        System.out.println(min);
       int total = res - (high + min);
        System.out.println(total/(double)(n-2));
    }
}
