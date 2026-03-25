package com.ust;

public class MainKushal {
    static void main() {
        ArithmeticOperationKushal aok = new ArithmeticOperationKushal();
        System.out.println("Addition of two numbers is : " + " " + aok.add(6, 2));
        System.out.println("Subtraction of two numbers is : " + " " + aok.subtract(6, 2));
        System.out.println("Multiplication of two numbers is : " + " " + aok.multiply(6, 2));
        System.out.println("Division of two numbers is : " + " " + aok.division(6, 2));
    }
    /*
    public static int addNum(int n1, int n2) {
        return n1 + n2;
    }*/
}
