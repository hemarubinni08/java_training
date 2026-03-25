package com.ust;

public class StringReverseVarsha {
    public static void main(String[] args) {
        System.out.println(printName("varsha"));
    }

    public static String printName(String str) {
        String rev = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;

    }

}
