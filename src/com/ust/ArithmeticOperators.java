package com.ust;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(add(5, 6, 7));
        System.out.println(add(3, 5));

    }


    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

}



