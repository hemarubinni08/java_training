package com.ust;

public class ArthimeticOperators {
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

    public static void main(String args[]) {
        ArthimeticOperators newArth = new ArthimeticOperators();
        System.out.println("Addition: "+newArth.add(2, 3));
        System.out.println("Substraction: "+newArth.sub(34, 5));
        System.out.println("Multiplication: "+newArth.mul(2, 5));
        System.out.println("Divison: "+newArth.div(5, 5));

    }
}
