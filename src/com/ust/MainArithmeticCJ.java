package com.ust;

public class MainArithmeticCJ {
    public static void main(String[] args) {
        ArithmeticOperations object = new ArithmeticOperations();
        int sum = object.addition(10, 2);
        int difference = object.subtraction(10, 2);
        int product = object.multiplication(10, 2);
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product);
    }
}
class ArithmeticOperations {
    int addition(int a, int b) {
        return a + b;
    }
    int subtraction(int a, int b) {
        return a - b;
    }
    int multiplication(int a, int b) {
        return a * b;
    }
}