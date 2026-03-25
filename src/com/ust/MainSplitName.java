package com.ust;

import javax.xml.transform.Source;

public class MainSplitName{
    public static void main(){
        String name = "bewin";
        int i = 0;
        while(name.charAt(i) != 'w'){
            System.out.println(name.charAt(i));
            i++;
        }
    }
}

