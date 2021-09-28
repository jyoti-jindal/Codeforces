package main.java.problems;

import java.util.Scanner;

public class StonesOnTable266A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
