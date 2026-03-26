package com.ust;

import java.util.Scanner;
/* Code for printing the letters of a string until letter 'a' is found.
Irrespective of case sensitivity
 */
public class loop_akash {
    public static void loop(String name) {
        name = name.toLowerCase();
        char[] letter = name.toCharArray();
        int i = 0;
         do {
            System.out.println(letter[i++]);
        }while (letter[i] != 'a');
        System.out.println(("Exiting...."));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        loop(name);
    }
}
