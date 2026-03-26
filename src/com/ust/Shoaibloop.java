package com.ust;

import java.util.Scanner;

public class Shoaibloop {
    public static void loop() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = in.nextLine();
        int i = 0;
        while (i < name.length()) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
                break;
            }
            System.out.print(name.charAt(i));
            i++;
        }
    }
        public static void main(String[]args)
        {
                loop();

        }
    }
