package main.java.problems;

import java.util.Scanner;

public class QueueAtSchool266B {
    /**
     * <a href="https://codeforces.com/problemset/problem/266/B">266B. Queue at the School</a>
     * TC: O(n*t)
     * SC: O(1)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = scn.nextInt();
        String str = scn.next();
        for (int i = 0; i < t; i++) {
            str = str.replace("BG", "GB");
        }
        System.out.println(str);
    }
}
