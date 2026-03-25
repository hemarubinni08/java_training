package com.ust;

public class Deepakreverse {
    public static void main(String[] args) {
        String str = "Deepak";
        String rev = "";
        for (int i = str.length() - 1;i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
