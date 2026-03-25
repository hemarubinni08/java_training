package com.ust;

import java.util.Scanner;

public class OperationMath {
    int a = 19;
    int b = 20;

    int add() {
        return a + b;
    }


    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

    public static void main(String[] args) {
        OperationMath solution = new OperationMath();
        System.out.println(solution.add());
        System.out.println(solution.sub());
        System.out.println(solution.mul());

    }
}
