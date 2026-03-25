package com.ust;

public class MainReverseStrNagarajan {
    public static void main(String[] args) {

        System.out.println(reverseStr("Nagarajan"));

    }

    public static String reverseStr(String str) {

        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += String.valueOf(str.charAt(i));

        }
        return reverseString;

    }
}
