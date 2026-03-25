package com.ust;

public class FindA {
    public static void findingA(String name) {
        int i = 0;
        while (i < name.length() && ((name.charAt(i) != ('a')))) {
            System.out.print(name.charAt(i));
            i++;
        }
    }

    public static void main(String[] args) {
        String name = "Yeshwanth";
        findingA(name);
    }
}
