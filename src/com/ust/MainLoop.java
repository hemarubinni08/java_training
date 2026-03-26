package com.ust;

public class MainLoop {
    public static void main(String[] args) {
        String name = "Stranger Things";
        int i = 0;
        while (i < name.length()) {
            char ch = name.charAt(i);
            System.out.println(ch);
            if (ch == 'g') {
                break;
            }
            i++;
        }
    }
}
