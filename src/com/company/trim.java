package com.company;
import java.util.Scanner;

public class trim {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         String name =  sc.next().trim();
         char ch = name.charAt(0);
        System.out.println(ch);

    }
}
