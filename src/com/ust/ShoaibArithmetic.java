package com.ust;

public class ShoaibArithmetic {
    int number1;
    int number2;

    public  int addition(int number1, int number2)
    {
        return number1+number2;
    }
    public int subtract(int number1,int number2)
    {
        if(number1>number2)
        {
            return number1-number2;
        }
        return number2-number1;
    }
    public int multiply(int number1,int number2)
    {
        return number1*number2;
    }
}
