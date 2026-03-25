package com.ust;

public class FindCharacterPranav {

    public static void main(String[] args) {
        checkAcharacter("Pranav");
    }

    public static void checkAcharacter(String str) {
        String[] characterarray = str.toLowerCase().split("");
        int len = characterarray.length;
        int i = 0;

        while (i < len) {
            if (characterarray[i].equals("a")) {
                System.out.println("Just found character A");
                break;
            } else {
                System.out.println(characterarray[i]);
            }
            i++;
        }
    }
}
