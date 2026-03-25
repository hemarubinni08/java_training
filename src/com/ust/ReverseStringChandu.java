package com.ust;

public class ReverseStringChandu {
    public static void main(String[] args) {
        String str = "chandrashekhar";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
    }
}
