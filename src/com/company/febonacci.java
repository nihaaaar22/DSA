package com.company;
public class febonacci {
    public static void main(String args[]) {
        int one = 1;
        int two = 1;
        int next = 2;

        System.out.println(one+" "+two);
        do {

           System.out.println(next);
           one = two;
           two = next;
           next = one + two;


        }
        while (next < 100);


    }
}
