package OOP;

public class StaticBlock {
    static int a = 5;
    static int b;
    static{ //used to initialise static variables
        System.out.println("inside static block");
        b = a * 2;

    }

    public static void main(String[] args) {
        //StaticBlock obj = new StaticBlock();
        System.out.println(b +" "+a);//if you initialize in static block it only runs once
        a+= 2;
        System.out.println(b +" "+a);
    }
}
