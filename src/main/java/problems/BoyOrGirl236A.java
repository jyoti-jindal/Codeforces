package main.java.problems;

import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl236A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<str.length(); i++) {
            set.add(str.charAt(i));
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
