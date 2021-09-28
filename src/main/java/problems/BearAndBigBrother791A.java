package main.java.problems;

import java.util.Scanner;

public class BearAndBigBrother791A {
    /**
     * <a href="https://codeforces.com/problemset/problem/791/A">791A. Bear and Big Brother</a>
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param args
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        long l = scn.nextInt();
        long b = scn.nextInt();
        int count = 0;
        while (l <= b) {
            l *= 3;
            b *= 2;
            count++;
        }
        System.out.println(count);
    }
}
