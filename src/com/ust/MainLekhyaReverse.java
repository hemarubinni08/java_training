package com.ust;

public class MainLekhyaReverse {
    public static void main(String[] args) {
        System.out.println(reverseAString("lekhya"));
    }

    public static String reverseAString(String str) {
        int n = str.length();
        String reverse = "";
        for (int i = n - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
