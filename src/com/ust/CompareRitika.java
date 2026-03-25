package com.ust;

public class CompareRitika {
    public static void main(String[] args){
        String name = "Ritika";
        System.out.println(compareName(name));
    }
    public static String compareName(String name){
        String result=" ";
        for(int i=0;i<=name.length()-1;i++)
        {
            if(name.charAt(i)=='a' || name.charAt(i)=='A')
                break;
            result += name.charAt(i);
        }
        return  result;



    }
}
