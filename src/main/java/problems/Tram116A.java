package main.java.problems;

import java.util.Scanner;

public class Tram116A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int count =0;
        int bestCount = Integer.MIN_VALUE;
        for(int i = 0; i < t; i++) {
            int l = scn.nextInt(); // 1
            int r = scn.nextInt(); // 3
            count -=l;
            count +=r;
            bestCount = Math.max(bestCount, count);
        }
        System.out.println(bestCount);
    }
}
