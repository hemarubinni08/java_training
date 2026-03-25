package com.ust;

public class StringLoop {
    public static void main(String[] args) {
        String name = "lekhya";
        int i = 0;
        while (name.charAt(i) != 'a') {
            System.out.println(name.charAt(i));
            i++;
        }
    }
}
