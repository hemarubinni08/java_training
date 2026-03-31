package com.ust;

import java.util.List;

public class AlphabeticalOrderHemanth {

    public static boolean compareTwo(String s1 , String s2) {
        int len = Math.min(s1.length() , s2.length());
        for (int i = 0; i < len; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 > c2) {
                return true;
            } else if(c2 > c1){
                return false;
            }
        }
        return false;
    }
    public static List<String> alphabetOrder(List<String> list){
        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-i-1;j++){
                if(compareTwo(list.get(j) ,list.get(j+1))){
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;
    }
}
