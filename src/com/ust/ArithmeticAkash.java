package com.ust;

//  code for add, subtract, multiply and division
public class ArithmeticAkash {
    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static double subtract(double a, double b, double c) {
        return Math.abs(a - (b - c));
    }

    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public static double division(double a, double b, double c) {
        return a / (b /c);
    }
}
