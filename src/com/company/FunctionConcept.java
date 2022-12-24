package com.company;

public class FunctionConcept {
     static int x = 50;

    public static void main (String args[]){
        System.out.println(x);
        x += 10;//if int x written then new variable formed
        int x = 53;


        newFun(x);
    }
    static void newFun(int x){
        System.out.println(x);

    }
}
