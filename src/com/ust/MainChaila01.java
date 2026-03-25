package com.ust;

public class MainChaila01 {
    public static void main(String[] args) {
        String Name = "Chailashree";
        StringBuilder reversename = new StringBuilder(Name);
        reversename.reverse();
        String reverse = reversename.toString();
        System.out.println("reversed name :" + reverse);
    }

}

