package com.ust;

public class name {
    public static void main(String[] args) {
        String name = "Ritika Kumari";
        System.out.println("Reversed Name=" + " " + reverseName(name));

    }

    public static String reverseName(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        return reverse;
    }
}
