package OOP;

public class Static {
    public static void main(String[] args) {
       // fun();
        Static b = new Static();
        b.fun2();

    }
//     static void fun(){
//        Static s = new Static();
//        s.greeting();
//    }
    void fun2(){
        Static a = new Static();

        a.greeting();//this will be accepted cuz fun2 will share its object with greeting
    }
    void greeting(){
        System.out.println("hello world");
    }

}
