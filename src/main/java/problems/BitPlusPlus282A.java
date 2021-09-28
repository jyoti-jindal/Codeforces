package main.java.problems;

import java.util.Scanner;

public class BitPlusPlus282A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in); 
        int t = scn.nextInt();
        int x=0;
        for(int i=0; i<t; i++) {
            String s = scn.next();
            switch(s) {
                case "X++":
                    x++;
                    break;
                case "X--":
                    x--;
                    break;
                case "++X":
                    ++x;
                    break;
                case "--X":
                    --x;
                    break;
            }
        }
        System.out.println(x);
    }
}
