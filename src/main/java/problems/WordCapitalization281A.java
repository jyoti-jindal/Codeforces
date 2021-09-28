package main.java.problems;

import java.util.Scanner;

public class WordCapitalization281A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char c = str.charAt(0);
        StringBuilder s = new StringBuilder();
        if (c >= 97 && c<= 122) {
            char c1 = (char)(c-('a'-'A'));
            s.append(c1).append(str.substring(1));
            System.out.print(s.toString());
        } else {
            System.out.print(str);
        }
        
    }
    
}
