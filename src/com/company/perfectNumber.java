package com.company;
// not solved

public class perfectNumber {
    public static void main(String args[]) {
int n = 28;
        int sum = 0;


            for (int i = 2 ; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum = (sum) + (i);//+(j / i);
                }
            }
            if(sum==n){
                System.out.println(n+"is perfect");
            }




    }
}
