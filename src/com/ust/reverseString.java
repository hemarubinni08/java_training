package com.ust;
import java.util.*;
public class reverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter String");
        s=sc.next();
        System.out.println(reverseName(s));
    }
    public static String reverseName(String s){
        char c;
        String rev="";
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            rev=c+rev;
        }
        return rev;
    }
}
