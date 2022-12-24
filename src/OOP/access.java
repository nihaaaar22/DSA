package OOP;
import OOP.people;
import OOP.message;

public class access {

    String name;
    int rollno;
    public static void main(String[] args) {
          people nihar = new people(21,"Nihar Shettigar");
          people kunal = new people(21,"kunal kushawaha");
        System.out.println(nihar.population);
        message.message();
        access one = new access("nihar",21);
    }

    access(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
        System.out.println(this.name + " object has been created");
    }
}
