package Leetcode_questions;


import java.util.Scanner;
import  java.util.*;

public class BhupendraJogi {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // For handling subarrays starting from index 0

        for (int num : nums) {
            sum += num;
            // Check if there exists a subarray ending at the current index
            // with sum equal to (sum - k)
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            // Increment the count of subarrays with the current sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int result = subarraySum(arr, k);
        System.out.println(result);
    }
    }

