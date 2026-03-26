package com.ust;

import java.util.Arrays;

public class MainWhileLoop {
    public static void main(String[] args) {
        String name = "Chris_Johnson";
        int i = 0;
        while (name.charAt(i) != 'J') {
            System.out.println(name.charAt(i));
            i++;
        }
    }
}