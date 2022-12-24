package com.company;
import java.util.*;
public class numberPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
if(ispalindrome(n)){
    System.out.println("ispalindrome");

}
else{
    System.out.println("not palindrome");
}
    }
    static boolean ispalindrome(int n){

        int rev = 0;
        int t = n;
        while(t>0){
            rev = (rev*10)+t%10;
            t = t/10;
        }
        return rev ==n;
    }
}
