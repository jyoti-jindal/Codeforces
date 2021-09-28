package main.java.problems;

import java.util.Scanner;

public class SoldierAndBananas546A {
    /**
     * <a href="https://codeforces.com/problemset/problem/546/A">546A - Soldier and Bananas</a>
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param args
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        long k = scn.nextInt();
        long n = scn.nextInt();
        long w = scn.nextInt();
        long cost = 0;
        for (int i = 1; i <= w; i++) {
            cost += (i * k);
        }
        System.out.println(Math.max(cost - n, 0));
    }
}
