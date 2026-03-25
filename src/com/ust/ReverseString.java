package com.ust;

public class ReverseString {
    public static void main(String[]args){
        String name="aishu";
        String reversed = reversingWord(name);
        System.out.println(reversed);
    }
    public static String reversingWord(String str) {
        String reverse = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        return reverse;
    }
}

