package com.ust;

public class MainPranav {
    public static void main(String[] args) {
        ArithemeticProgramPranav ar = new ArithemeticProgramPranav();
        int sum = ar.addNumbers(5, 5);
        int difference = ar.subtractNumbers(5, 5);
        int product = ar.multiplyNumbers(5, 5);
        System.out.println("Sum " + sum);
        System.out.println("Difference " + difference);
        System.out.println("Product " + product);
    }
}
