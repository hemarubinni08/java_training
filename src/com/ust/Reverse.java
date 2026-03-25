package com.ust;

public class Reverse {
    public static void main(String[] args) {
        String originalString = "hemarubinni";
        System.out.println("Reversed String: " + stringReverse(originalString));
    }

    public static String stringReverse(String originalString) {
        String reversed = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversed += originalString.charAt(i);
        }
        return reversed;
    }
}
