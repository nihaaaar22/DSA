package OOP;

class student {

    static String naam;
    student(String naam){
        student.naam = naam;
    }

}
public class first{
    public static void main(String args[]){
        student one = new student("nihar");
        student two = new student("kunal");
        System.out.println(one.naam);
        System.out.println(two.naam);//both gets printed as kunal cuz this is static variable



    }
}

