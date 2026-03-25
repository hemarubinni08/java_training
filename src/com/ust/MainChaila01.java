package com.ust;

public class MainChaila01 {
    public static void main(String[] args){
        String a = "Chailashree";
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        String reverse = b.toString();
        System.out.println("reversed name :"+ reverse);
    }

}

