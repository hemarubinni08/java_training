package com.ust;

public class LoopName {
    public static void main(String[] args) {
        String str = "Gopinath";
        int i=0;
        while (str.charAt(i) != 'a') {

            System.out.print(str.charAt(i));
            i++;
        }
    }
}