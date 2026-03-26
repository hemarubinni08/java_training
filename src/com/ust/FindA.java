package com.ust;

public class FindA {
    public static void findingA(String name) {
        int i = 0;
        do{
            System.out.print(name.charAt(i));
            i++;
        }while (i < name.length() && ((name.charAt(i) != ('a'))));


    }

    public static void main(String[] args) {
        String name = "Yeshwanth";
        findingA(name);
    }
}
