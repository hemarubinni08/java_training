package com.ust;

public class MainReverse {
    public static void main(String[] args) {
        String str = "logesh";
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.print(rev);

    }
}
