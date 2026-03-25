package com.ust;

public class MainHarshavardhan {
    public static void main(String[] args) {
        System.out.println(substractNumber(3, 2));
        System.out.println(concatString("Hi ", "This is Harsha"));
    }

    public static int substractNumber(int a, int b) {
        return a - b;
    }

    public static String concatString(String a, String b){
        return a+b;
    }
}
