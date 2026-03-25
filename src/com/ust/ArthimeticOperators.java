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
        System.out.println(newArth.add(2, 3));
        System.out.println(newArth.sub(34, 5));
        System.out.println(newArth.mul(2, 5));
        System.out.println(newArth.div(5, 5));

    }
}
