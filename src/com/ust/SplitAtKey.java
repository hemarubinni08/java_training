package com.ust;

import java.util.Scanner;

public class SplitAtKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char[] split = new char[name.length()];
        int index = 0;
        System.out.println("enter the letter till where to be printed");
        char key = sc.next().charAt(0);
        while (index < name.length() && name.charAt(index) != key) {
            split[index] = name.charAt(index);
            System.out.println(split[index]);
            index++;
        }
       /* for(int i=0;i<name.length();i++){
            System.out.println(split[i]);
        }*/
    }
}
