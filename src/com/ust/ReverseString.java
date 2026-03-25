package com.ust;

public class ReverseString {
    public static void main(String[] args) {
        String Name = "Gopinath";
        System.out.println(reverseString(Name));
    }

    public static String reverseString(String Name) {
        String revString = " ";
        for (int i = Name.length() - 1; i >= 0; i--) {
            revString += Name.charAt(i);
        }
        return revString;
    }
}
