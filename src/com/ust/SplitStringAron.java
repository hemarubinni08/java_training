package com.ust;
import java.util.Scanner;

public class SplitStringAron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter the character to print until: ");
        char character=sc.next().charAt(0);
        printCharacters(name, character);
    }

    // Function to print characters of a string until "A" is found
    public static void printCharacters(String name, char character) {
        int i = 0;
        while (i < name.length()) {
            Character currentCharacter = name.charAt(i);
            if (currentCharacter.equals(character))
                break;
            else
                System.out.println(currentCharacter);
            i++;
        }
    }
}
