package com.ust;

import java.lang.*;

public class SplitStringAron {
    public static void main(String[] args) {
        String name = "Raja";
        printCharacters(name);
    }

    // Function to print characters of a string until "A" is found
    public static void printCharacters(String name) {
        int i = 0;
        while (i < name.length()) {
            Character currentCharacter = name.charAt(i);
            if (currentCharacter.equals('a') || currentCharacter.equals('A'))
                break;
            else
                System.out.println(currentCharacter);
            i++;
        }
    }
}
