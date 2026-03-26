package com.ust;

public class Name {
    public static void main(String[] args)
    {
        String name="Keerthi";
        int i=0;
        while(i<name.length())
        {
            char ch=name.charAt(i);
            System.out.println(ch);
            if(ch=='h')
            {
                break;
            }
            i++;
        }
    }
}
