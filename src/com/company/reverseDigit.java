package com.company;

public class reverseDigit {
    public static void main (String args[]) {
        int n = 7809;
        int res = 0;
        while (n > 0) {
            int i = n%10;
            res= (res*10)+i;
            n=n/10;

        }
        System.out.println(res);
    }
}
