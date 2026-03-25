package com.ust;

public class Main {
    public static void main(String[] args) {
        ArithemiticOperationNavaneeth ao = new ArithemiticOperationNavaneeth();
        int sum = ao.addition(2, 3);
        int subraction = ao.subraction(5, 3);
        int multiply = ao.multiply(8, 5);

        System.out.println("Addition:" + sum);
        System.out.println("Subraction:" + subraction);
        System.out.println("Multiply:" + multiply);
    }
}
