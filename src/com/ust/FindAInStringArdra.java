package com.ust;

import java.util.Scanner;

public class FindAInStringArdra {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine();
        int index = 0;
        while (userString.charAt(index) != 'a' || userString.charAt(index) != 'A') {
            System.out.printf("%c", userString.charAt(index));
            index++;
        }
        System.out.printf("%c", userString.charAt(index));
    }
}