package strings;

public class equals {
    public static void main(String[] args) {
        String name = "nihar";
        String name1= "nihar";
        System.out.println(name==name1);
        String a = new String("helloworld");
        String b = new String("helloworld");
        System.out.println(a==b);
        System.out.println(a.equals(b));//only checks value
    }
}
