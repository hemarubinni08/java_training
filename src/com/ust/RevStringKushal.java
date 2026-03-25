package com.ust;

public class RevStringKushal {
    public static void main() {
        System.out.println(revName("Kushal"));
    }

    public static String revName(String name) {
        String revName = new StringBuilder(name).reverse().toString();
        return revName;
    }
}
