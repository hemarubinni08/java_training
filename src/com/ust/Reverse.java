package com.ust;

public class Reverse {
    public static void main(String[] args) {
        String str = "keerthi";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
