package com.ust;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String yourString = sc.nextLine();
        System.out.println(reverseString(yourString));
    }

    public static String reverseString(String exampleString) {
        String resultString = "";
        for (int i = 0; i < exampleString.length(); i++) {
            resultString = resultString + exampleString.charAt(exampleString.length() - i - 1);
        }
        return resultString;
    }
}