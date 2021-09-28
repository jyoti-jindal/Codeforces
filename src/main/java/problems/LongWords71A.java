package main.java.problems;

import java.util.Scanner;

public class LongWords71A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 0; i < t; i++) {
            String s = scn.next();
            StringBuilder str = new StringBuilder();
            int n = s.length();
            if (n > 10) {
                str = str.append(s.charAt(0)).append(n - 2).append(s.charAt(n - 1));
                System.out.println(str.toString());
            } else {
                System.out.println(s);
            }
        }
    }
}
