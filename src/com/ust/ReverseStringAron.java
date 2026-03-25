package com.ust;

public class ReverseStringAron {
    public static void main(String[] args) {
        String name = "Aron";
        System.out.println(reverseName(name));
    }

    public static String reverseName(String name) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseString.append(name.charAt(i));
        }
        return reverseString.toString();
    }
}
