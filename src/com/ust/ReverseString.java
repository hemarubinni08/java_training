package com.ust;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter String");
        s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        char c;
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            rev = c + rev;
        }
        return rev;
    }
}
