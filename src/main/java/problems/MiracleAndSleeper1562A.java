package main.java.problems;

import java.util.Scanner;

/**
 * 1 1 ==> 0 1 2 ==> 0 1 3 ==> 1 1 4 ==> 1 1 5 ==> 2 1 6 ==> 2 1 7 ==> 3 1 8 ==>
 * 3 1 9 ==> 4
 * 
 * @author jyotij
 */
public class MiracleAndSleeper1562A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 0; i < t; i++) {
            int l = scn.nextInt(); // 1
            int r = scn.nextInt(); // 3
            int ans = r % Math.max(l, (r / 2) + 1);
            System.out.println(ans);
        }
    }
}
