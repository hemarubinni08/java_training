package com.ust;

public class MainReverseStrNagarajan {
    public static void main(String[] args) {

        System.out.println(reverseString("Nagarajan"));

    }

    public static String reverseString(String str) {

        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += String.valueOf(str.charAt(i));

        }
        return revStr;

    }
}
