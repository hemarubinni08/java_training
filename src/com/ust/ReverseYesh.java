package com.ust;

import java.util.*;

public class ReverseYesh {
    public static void main(String[] args) {
        String name = "Yeshwanth";
        System.out.println(reverseString(name));

    }

    public static String reverseString(String name) {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        return rev;
    }

}
