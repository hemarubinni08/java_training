package com.ust;

public class MainReverseStr {
    public static void main(String[] args){
        String name="Chris_Johnson";
        String reverse=StringReversal(name);
        System.out.println(reverse);
    }
    public static String StringReversal(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
}
