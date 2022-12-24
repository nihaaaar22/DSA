package test;

import java.util.Arrays;

public class passByValue {
    public static void main(String args[]){


        int a = 3;
        {
            a = 5;
        }
        System.out.println(a);

    }

}
