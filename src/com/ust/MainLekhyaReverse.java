package com.ust;

public class MainLekhyaReverse {
    public static void main(String[] args) {
        System.out.println(reverseAString("lekhya"));
    }

    public static String reverseAString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
