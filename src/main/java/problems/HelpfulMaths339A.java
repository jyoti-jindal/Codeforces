package main.java.problems;

import java.util.Scanner;

public class HelpfulMaths339A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = 0;
        int start =0;
        int end = str.length() - 1;
        char ch[] = str.toCharArray();
        // 3+2+1
        while (i <= end) {
            switch (ch[i]) {
                case '1':
                    swap(ch, start, i);
                    i += 2;
                    start += 2;
                    break;
                case '3':
                    swap(ch, end, i);
                    end -= 2;
                    break;
                default:
                    i += 2;
                    break;
            }
        }
        System.out.println(new String(ch));
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
