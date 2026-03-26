package com.ust;

public class BankDetails {
    public static int addBalance(int a, int b) {
        return a + b;
    }

    public static int minusBalance(int a, int b) {
        if (a < b) {
            System.out.println("insufficent balance");
        }
        return a - b;
    }
}