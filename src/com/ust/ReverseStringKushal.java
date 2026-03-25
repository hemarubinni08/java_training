package com.ust;

public class ReverseStringKushal {
    public static void main() {
        String originalString = "kushal";
        System.out.println(reverseString(originalString));
    }

    public static String reverseString(String name) {
        String reverseString = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseString = reverseString + name.charAt(i);
        }
        return reverseString;
    }
}
