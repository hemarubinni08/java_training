package com.ust;

public class Reverse {
    public static void main(String[] args) {
        String str = "keerthi";
        // String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String name) {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        return rev;
    }
}
