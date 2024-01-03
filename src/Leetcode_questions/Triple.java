package Leetcode_questions;
import java.util.*;

public class Triple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each integer
        for (int i = 0; i < n; i++) {
            countMap.put(ans[i], countMap.getOrDefault(ans[i], 0) + 1);
        }

        int threshold = n / 3;

        // Find representatives
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey());
            }
        }
    }
}
