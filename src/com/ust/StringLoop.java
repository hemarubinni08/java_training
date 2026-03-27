package com.ust;

public class StringLoop {
    public static void main(String[] args) {
        String name = "lekhya";
        int i = 0;
        do{
            System.out.print(name.charAt(i));
            i++;
        }while (name.charAt(i) != 'a');
    }
}
