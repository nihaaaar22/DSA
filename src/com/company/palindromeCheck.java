package com.company;

public class palindromeCheck {
    public static void main(String args[]){
        String name = "nihar";
        if (check(name)==true){
            System.out.println("string is a palindrome");}
        else{
            System.out.println("not a palindrome");
        }

    }
    static boolean check(String name) {
        int n = name.length();

        for (int i = 0; i < n / 2; i++) {
            if(name.charAt(i)!= name.charAt(n-(i+1))){
                return false;
            }
        }
        return true;
    }
}
