package main.java.problems;

import java.util.Scanner;

public class NextRound158A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int score[] = new int[n];
        for(int i = 0; i < n; i++) {
            score[i] = scn.nextInt();
        }
//        if (score[k - 1] == 0) {
//            System.out.println("0");
//            return;
//        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (score[i] > 0) {
                if ((i>=k && score[i] >= score[k - 1]) || i<k) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
