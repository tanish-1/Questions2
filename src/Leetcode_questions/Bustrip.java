package Leetcode_questions;
import java.util.*;
public class Bustrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Time taken by each bus
        }
        int ttrips = scanner.nextInt(); // Total number of trips required
        System.out.println(minimumTime(arr, ttrips));
    }

    private static long minimumTime(int[] arr, int ttrips) {
        long left = 1;
        long right = (long) 1e14;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canCompleteTrips(arr, mid, ttrips)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean canCompleteTrips(int[] arr, long time, int ttrips) {
        long count = 0;
        for (int t : arr) {
            count += time / t;
            if (count >= ttrips) return true;
        }
        return count >= ttrips;
    }
}
