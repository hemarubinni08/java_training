package com.ust;

public class FindingTheLetterChandu {
    public static void main(String[] args) {
        String name = "chandrashekhar";
        char target = 'e';
        int i = 0;

        while (i < name.length()) {
            System.out.println(name.charAt(i));
            if (name.charAt(i) == target) {
                System.out.println("Found the letter " + target);
                break;
            }
            i++;
        }
        if (i == name.length()) {
            System.out.println("Not found");
        }

    }
}
