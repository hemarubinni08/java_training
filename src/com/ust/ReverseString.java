package com.ust;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("fijul"));
    }

    public static String reverseString(String s) {
        int l = s.length();
        String reversed = "";
        for (int i = l - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
}
