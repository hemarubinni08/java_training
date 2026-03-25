package com.ust;

public class MainArithmeticNagarajan {
    public static void main(String[] args) {
        ArithmeticOperation calc = new ArithmeticOperation();
        System.out.println("5+4 = " + calc.addition(5, 4));
        System.out.println("5-4 = " + calc.subtraction(5, 4));
        System.out.println("5*4 = " + calc.multiplication(5, 4));
    }
}

class ArithmeticOperation {

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
