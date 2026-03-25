package com.ust;
import java.util.Scanner;

public class Reverse {

    public static void main(String []args)
    {
        StringBuilder ans= new StringBuilder();
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println("Your name is"+" "+str);
        for(int i=str.length()-1;i>=0;i--)
        {
            ans.append(str.charAt(i));
        }
        System.out.println("your reverse name is"+" "+ans);
    }
}
