package com.ust;

public class MainReverseString {
    public static void main() {
        String name = "Bewin";
        String reversed = reverseString(name);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        String reverse = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
