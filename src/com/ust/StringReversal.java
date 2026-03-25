package com.ust;

import java.util.Scanner;

public class StringReversal {
    public static String nameReversal(String name) {
        StringBuilder s = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            s.append(name.charAt(i));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(nameReversal(name));
    }
}
