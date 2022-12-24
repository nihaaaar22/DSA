package strings;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+ 1);//returns 98
        System.out.println('a');//returns a
        System.out.println((char)('a'+ 1));//returns b value of which is 98
        System.out.println((int)('a'));//returns the numerical value of a
        System.out.println("a"+1);//returns a1
        char[] ch = "hello".toCharArray();
        System.out.println(ch);
        System.out.println("hello"+ new ArrayList<>());
        String ans = 78+"s";//you can add this given that any one element is string
        System.out.println("ans ="+ans);
        System.out.println((char)(75));
        System.out.println(new ArrayList<>()+"");
        //System.out.println(new Integer(56)+new ArrayList<>());
        //cannot do this cuz at least one element needs to be string
    }
}
