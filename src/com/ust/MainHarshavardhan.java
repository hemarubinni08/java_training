package com.ust;

public class MainHarshavardhan {
    public static void main(String[] args) {
        System.out.println(subNumber(3, 2));
        System.out.println(concatString("Hi ", "This is Harsha"));
    }

    public static int subNumber(int a, int b) {
        return a - b;
    }

    public static String concatString(String a, String b){
        return a+b;
    }
}
