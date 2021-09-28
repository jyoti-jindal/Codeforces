package main.java.problems;

import java.util.Scanner;

public class DominoPiling50A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in); 
        int m = scn.nextInt();
        int n = scn.nextInt();
        
        int a = (m*n)/2;
        System.out.println(a);
    }
}
