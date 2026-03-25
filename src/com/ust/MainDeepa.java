package com.ust;

public class MainDeepa {
    public static void main(String args[]) {
        System.out.println(printName("Deepakarthika"));
    }

    public static String printName(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
}
