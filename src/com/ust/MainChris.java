package com.ust;

public class MainChris {
    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }

    public static Integer factorial(int num) {
        int prod = 1;
        for (int i = 1; i <= num; i++) {
            prod = prod * i;
        }
        return prod;
    }
}
