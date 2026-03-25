package com.ust;

import java.util.Scanner;

public class Reverse_code_Akash {
    public static void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        String rev = "";
        char ch[] = name.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        System.out.println("Reverse String:" + rev);
    }

    public static void main(String args[]) {
        reverse();
    }
}
