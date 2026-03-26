package com.ust;

public class MainReverse {
    public static void main(String[] args) {
        String name = "Rohit";
        System.out.println(revString(name));
    }

    public static String revString(String name) {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        return rev;
    }
}
