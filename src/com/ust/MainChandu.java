package com.ust;

public class MainChandu {
    public static void main(String[] args) {
        ArithameticOperationsChandu obj = new ArithameticOperationsChandu();

        int number1 = 5;
        int number2 = 6;

        System.out.println("Addition : " + obj.addition(number1, number2));
        System.out.println("Substraction : " + obj.substraction(number1, number2));
        System.out.println("Multiplication : " + obj.multiplication(number1, number2));
    }

}
