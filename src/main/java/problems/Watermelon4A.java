package main.java.problems;

import java.util.Scanner;

public class Watermelon4A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n>3 && n % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
