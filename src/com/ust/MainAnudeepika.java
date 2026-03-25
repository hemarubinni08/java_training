package com.ust;

import java.util.Scanner;

public class MainAnudeepika {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed2 = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed2 += original.charAt(i);
        }
        System.out.println("Reversed using loop: " + reversed2);
    }
}