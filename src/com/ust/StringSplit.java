package com.ust;

public class StringSplit {
    public static void main(String args[]){
        String name="navya";
        int i=0;
        while(i<name.length()){
            if(name.charAt(i)=='v'){
                break;
            }

            System.out.println(name.charAt(i));
            i++;

        }
    }
}
