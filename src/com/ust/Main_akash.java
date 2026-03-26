package com.ust;

import java.util.Scanner;

public class Main_akash {
    static int a = 0, b = 0;

    public static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println(("Enter the second number"));
        b = sc.nextInt();
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        accept();
        System.out.println("Answer: " + addNumbers(a, b));
    }
}
