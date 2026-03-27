package com.ust;

public class Arithmetic {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a-b;
    }
    public static void main(String[] args){

        Arithmetic obj = new Arithmetic();
        System.out.println(obj.add(5.5, 6.9));

    }
}
