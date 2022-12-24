package recursion;

public class numbersegRecursion {
    public static void main(String args[]){
        message(1);
    }
    static void message(int a ){
        if(a==5){
            System.out.println(a);
            return;
        }
        System.out.println(a);
        message(a+1);
    }
}
