package com.ust;

public class StringReversePranav {
    public static void main(String[] args) {
        String result = strReverse("Hari");
        System.out.println(result);
    }

    public static String strReverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
