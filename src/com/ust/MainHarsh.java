package com.ust;

public class MainHarsh {
    public static void main(String args[]) {
        System.out.println(addString("harsh", "Singh"));
        ArithmeticOperation ob = new ArithmeticOperation();
        System.out.println(ob.addition(3, 5));
        System.out.println(ob.substract(10, 5));
        System.out.println(ob.multiply(3, 5));
        System.out.println(ob.divide(3, 5));
    }

    public static String addString(String A, String B) {
        return A + B;
    }
}
