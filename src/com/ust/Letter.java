package com.ust;

public class Letter {
    public static void main(String[] args) {
        String name = "gokul";
        int i = 0;

        while (i < name.length()) {
            char ch = name.charAt(i);
            if (ch == 'u') {
                break;
            }
            System.out.print(ch);
            i++;
        }
    }
}
