package main.java.problems;

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/977/A">977A. Wrong Subtraction</a>
 * Time Complexity: O(k)
 * Space Complexity: O(1)
 */
public class WrongSubtraction977A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
        }
        System.out.println(n);
    }
}
