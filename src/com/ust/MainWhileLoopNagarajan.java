package com.ust;

import java.util.Arrays;

public class MainWhileLoopNagarajan {
    public static void main(String[] args) {
        String name = "Nagarajan";
        int i = 0;
        while (name.charAt(i) != 'j') {
            System.out.print(name.charAt(i));
            i++;
        }
    }
}
