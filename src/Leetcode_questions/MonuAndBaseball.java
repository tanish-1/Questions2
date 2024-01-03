package Leetcode_questions;

import java.util.Scanner;
import java.util.Stack;

public class MonuAndBaseball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Input size of the array
            int N = scanner.nextInt();

            // Input array elements
            String[] ops = new String[N];
            for (int i = 0; i < N; i++) {
                ops[i] = scanner.next();
            }

            // Output the sum of all the scores on the record
            int result = calPoints(ops);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;}
}
