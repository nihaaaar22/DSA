package com.company;

public class reverseString {
    public static void main(String args[]){
        StringBuilder name = new StringBuilder("i love lou");
        int length = name.length();
        for(int i =0;i<length/2;i++){
            char Temp = name.charAt(i);
            name.setCharAt(i, name.charAt(length-i-1));

            name.setCharAt(length-i-1,Temp);

        }

        System.out.println(name);
    }
}
