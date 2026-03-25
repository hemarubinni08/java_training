package com.ust;

public class SplitName {
    public static void main(String[] args) {
        String str = "aishu";
        int i = 0;
        while (str.charAt(i) != 's'){
            System.out.println(str.charAt(i));
            i++;
        }
    }
}

