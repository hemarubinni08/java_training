package com.ust;

public class WhileFijul {
    public static void main(String[] args) {
        printCharacters("hfgdyais");
    }

    public static void printCharacters(String name) {
        int i = 0;
        String[] array = name.toLowerCase().split("");
        int length = array.length;
        while (i < length) {
            if (array[i].equals("a")) {
                System.out.println("found a");
                break;
            } else {
                System.out.println(array[i]);
            }
            i++;
        }
    }
}