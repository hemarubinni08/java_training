package com.ust;

import java.util.Scanner;

public class WhileLoopDeepa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String givenName = sc.nextLine();
        char ch = sc.next().charAt(0);
        String s[] = givenName.split(" ");
        int i = 0;
        int index = 0;
        while (i < s.length) {
            int j = 0;
            while (j < s[i].length()) {
                if (s[i].charAt(j) == ch) {
                    System.out.println(s[i].charAt(j) + " found at index " + index);
                    return;
                }
                j++;
                index++;
            }
            index++;
            i++;
        }
    }

}
