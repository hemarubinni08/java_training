package com.ust;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperations a = new ArithmeticOperations();
        System.out.println(a.addition(2, 3));
        System.out.println(a.subtraction(5, 4));
        System.out.println(a.multiplication(2, 3));
        System.out.println(a.division(8, 2));
        ArithemeticProgramPranav ar = new ArithemeticProgramPranav();
        int sum = ar.addNumbers(5, 5);
        int difference = ar.subtractNumbers(5, 5);
        int product = ar.multiplyNumbers(5, 5);
        System.out.println("Sum " + sum);
        System.out.println("Difference " + difference);
        System.out.println("Product " + product);
    }
}
