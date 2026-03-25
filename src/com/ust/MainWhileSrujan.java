package com.ust;

public class MainWhileSrujan {
    public static void main(String[] args) {
        String name = "srujan";
        int i = 0;
        while (i < name.length()) {
            if (name.charAt(i) != 'a') {
                System.out.println(name.charAt(i));
                i++;
            } else {
                System.out.println("found the letter 'a'");
                break;
            }
        }

    }
}
