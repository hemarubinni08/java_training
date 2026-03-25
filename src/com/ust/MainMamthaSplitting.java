package com.ust;

public class MainMamthaSplitting {
    public static void main(String[] args) {
        String str = "Mamathah";
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == 'h') {
                break;
            }
            System.out.println(c);
            i++;
        }
    }
}
