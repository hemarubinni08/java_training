package com.ust;
//Driver code for ArithmeticAkash
import java.util.Scanner;
public class Main_akash {
    public static void main(String[] args) {
        ArithmeticAkash arithmeticObject = new ArithmeticAkash();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int first_number = sc.nextInt();
        int second_number = sc.nextInt();
        System.out.println("Sum of numbers: " + ArithmeticAkash.add(first_number, second_number));
        System.out.println("Difference of numbers: " + ArithmeticAkash.subtract(first_number, second_number));
        System.out.println("Multiplication result of numbers: " + ArithmeticAkash.multiply(first_number, second_number));
        System.out.println("Division of numbers: " + ArithmeticAkash.division(first_number, second_number));
    }
}
