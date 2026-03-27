package com.ust;

public class Mamtha_Arthimetic {
    public static void main(String[] args) {
        Arithmetic oprators = new Arithmetic();
        System.out.println(oprators.addition(2, 3));
        System.out.println(oprators.subtraction(5, 3));
        System.out.println(oprators.multiplication(3, 5));
        System.out.println(oprators.division(8, 4));
    }
}

class Arithmetic {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
}

