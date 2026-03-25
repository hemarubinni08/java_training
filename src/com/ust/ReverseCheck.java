package com.ust;

public class ReverseCheck {
    public static void main(String[] args) {
        String name = "Yeshwanth";
        System.out.println(reverseString(name));

    }

    public static String reverseString(String name) {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        return rev;
    }
}
