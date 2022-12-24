package com.company;
import java.util.*;
public class Switch {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("type fav fruit");
     String fruit = sc.next();
//     switch(fruit){
//         case "mango":
//             System.out.println("sweet fruit");
//             break;
//         case "grapes":
//             System.out.println("small fruit");
//             break;
//         case "apple":
//             System.out.println("keeps the doctor away wala fruit");
//             break;
//         default:
//             System.out.println("bhai ye sab doglapan hai");
//
//     }
        switch (fruit) {
            case "mango" -> {
                System.out.println("sweet fruit");
                System.out.println("this is nihar's favourite fruit");
            }
            case "grapes" -> System.out.println("small fruit");
            case "apple" -> System.out.println("keeps the doctor away wala fruit");
            default -> System.out.println("bhai ye sab doglapan hai");
        }
    }
}
