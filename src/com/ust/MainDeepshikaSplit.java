package com.ust;

public class MainDeepshikaSplit {
    public static void main(String[] args) {
        String name = "Deepshika";
        int i = 0;
        while (i < name.length()) {
            char ch = name.charAt(i);
            if (ch == 's') {
                break;
            }
            System.out.print(ch);
            i++;
        }
    }
}