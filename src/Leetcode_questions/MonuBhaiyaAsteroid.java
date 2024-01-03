package Leetcode_questions;

import java.util.*;

public class MonuBhaiyaAsteroid {
    public static List<Integer> asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            collision:
            {
                while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                    if (stack.peek() < -ast) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -ast) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int ast : stack) {
            result.add(ast);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] asteroids = new int[n];
        for (int i = 0; i < n; i++) {
            asteroids[i] = scanner.nextInt();
        }
        List<Integer> result = asteroidCollision(asteroids);
        for (int ast : result) {
            System.out.print(ast + " ");
        }
    }
}