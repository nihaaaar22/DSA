package com.company;
import java.util.Scanner;

public class ifLowerCase {
    public static void main(String args[]) {
        char ans;
       do{

           System.out.println("type you name");
           Scanner sc = new Scanner(System.in);
         char a = sc.next().trim().charAt(0);//trim function eliminates the leading and trailing spaces


        if (a >= 'a' && a <= 'z') {
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
           System.out.println("press y if you wish to continue");
           ans = sc.next().charAt(0);

    }
       while(ans == 'y');

     }

}
