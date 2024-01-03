package Leetcode_questions;

import java.util.Scanner;

public class SortBooks{
    public static void sortBooks(char[] books) {
        int low = 0, mid = 0, high = books.length - 1;
        char temp;
        while (mid <= high) {
            switch (books[mid]) {
                case 'P':
                    temp = books[low];
                    books[low] = books[mid];
                    books[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 'C':
                    mid++;
                    break;
                case 'M':
                    temp = books[high];
                    books[high] = books[mid];
                    books[mid] = temp;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // Sample input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] books = new char[n];

        for (int i = 0; i < n; i++) {
            books[i] = sc.next().charAt(0);
        }

//        char[] books = {'P', 'M', 'C', 'C', 'P', 'M', 'C'};
        sortBooks(books);
        // Output the sorted array
        for (char book : books) {
            System.out.print(book + " ");
        }
    }
}
