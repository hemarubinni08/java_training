package com.ust;

public class BankDetails {
    public static int addBalance(int num1, int num2) {
        return num1 + num2;
    }

    public static int minusBalance(int num1, int num2) {
        if (num1 < num2) {
            System.out.println("insufficent balance");
        }
        return num1 - num2;
    }
    public static int addBalance(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}