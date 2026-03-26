package com.ust;

public class MainFijul {
    public static void main(String[] args) {
        BankDetails object = new BankDetails();
        System.out.println(object.addBalance(2000, 3000));
        System.out.println(object.minusBalance(4000, 2000));
    }
}