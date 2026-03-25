package com.ust;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Arithmetic Operation = new Arithmetic();
        System.out.println("addition:" + Operation.add(2, 5));
        System.out.println("Subtraction:" + Operation.subtract(7, 5));
        System.out.println("Multiplication:" + Operation.multiply(2, 5));
        System.out.println("Division:" + Operation.divide(10, 5));
    }
}

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}