package main.java.problems;

import java.util.Scanner;

public class BeautifulMatrix263A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in); 
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(scn.nextInt() == 1) {
                    System.out.println(Math.abs(3-(i+1))+Math.abs(3-(j+1)));
                }
            }
        }
    }
}
