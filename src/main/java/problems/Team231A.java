package main.java.problems;

import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int count = 0;
        for(int i = 0; i < t; i++) {
            int f1 = scn.nextInt();
            int f2 = scn.nextInt();
            int f3 = scn.nextInt();
            if (f1 + f2 + f3 > 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
