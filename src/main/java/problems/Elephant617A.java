package main.java.problems;

import java.util.Scanner;

public class Elephant617A {
    /**
     * <a href="https://codeforces.com/problemset/problem/617/A">617A. Elephant</a>
     * Time Complexity: O(logx) // maybe
     * Space Complexity: O(1)
     *
     * @param args
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int count = 0;
        while (x > 0) {
            x -= 5;
            count++;
        }
        System.out.println(count);
    }

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void solve() {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int count = x / 5;
        if (x % 5 > 0) {
            count++;
        }
        System.out.println(count);
    }
}
