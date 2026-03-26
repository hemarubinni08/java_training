package com.ust;

import java.util.*;

public class LoopHemanth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String name = sc.next();
        System.out.println(nameTillA(name));
    }

    public static String nameTillA(String s) {
        int length = s.length(), i = 0;
        String nameUntilA = "";
        while (i < length) {
            if (s.charAt(i) == 'a')
                break;
            else
                nameUntilA += s.charAt(i);
            i++;
        }
        return nameUntilA;
    }
}
