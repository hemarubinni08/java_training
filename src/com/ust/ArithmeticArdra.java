package com.ust;

public class ArithmeticArdra {
    public static void main(String[] args) {
        ArithmeticOperationsArdra obj = new ArithmeticOperationsArdra();
        System.out.println("enter your first number ");
        int firstNumber = 10;
        int secondNumber = 3;
        System.out.printf("addition: %d \n", obj.addition(firstNumber, secondNumber));
        System.out.printf("subtraction: %d \n", obj.subtraction(firstNumber, secondNumber));
        System.out.printf("multiply: %d \n", obj.multiply(firstNumber, secondNumber));
        System.out.printf("divide: %f \n", obj.divide(firstNumber, secondNumber));
    }
}

