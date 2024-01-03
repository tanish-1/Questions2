package Leetcode_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ShriRamArrow {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Input N and M
        long N = scanner.nextLong();
        long M = scanner.nextLong();

        // Calculate the day when the fight will end
        long day = calculateEndDay(N, M);

        // Output the result
        System.out.println(day);

        // Close the scanner
        scanner.close();
    }

    private static long calculateEndDay(long N, long M) {
        long day = 1;

        while (true) {
            // Ram adds arrows at the start of the day
            if (day != 1) {
                N += M;
            }

            // If arrows are less than the day counter, break the loop
            if (N <=       day) {
                break;
            }

            // Ravan destroys arrows
            N -= day;

            // Increment the day counter
            day++;
        }

        return day;
    }


}
