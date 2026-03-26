package com.ust;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Arithmetic oper = new Arithmetic();
        System.out.println("Addition :" + oper.add(2, 5));
        System.out.println("Subtraction :" + oper.sub(2, 5));
        System.out.println("Multiplication :" + oper.mul(2, 5));
        System.out.println(" Division:" + oper.div(5,10));
    }
}

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
