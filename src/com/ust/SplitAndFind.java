package com.ust;

public class SplitAndFind {
    public static void main(String[] args) {
        String name = "Roma";
        printTillA(name);
    }

    public static void printTillA(String name) {
        int i = 0;

        while (i < name.length()) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
                break;
            }
            System.out.print(name.charAt(i));
            i++;
        }
    }
}