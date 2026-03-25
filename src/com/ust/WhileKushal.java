package com.ust;

public class WhileKushal {
    public static void main() {
        String name = "kushal";
        int i = 0;
        while (i < name.length()) {
            if (name.charAt(i) != 'a') {
                System.out.print(name.charAt(i));
                i++;
            } else {
                break;
            }
        }
    }
}
