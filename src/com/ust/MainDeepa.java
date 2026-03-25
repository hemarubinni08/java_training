package com.ust;

public class MainDeepa {
    public static void main(String args[]) {
        System.out.println(printName("Deepakarthika"));
    }

    public static String printName(String originalString) {
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        return reversedString;
    }
}
