package OOP;

public class contructor {
  public static void main(String args[]){
      final people kunal = new people(13,"kunal kushwaha");// when final is assigned to a object the
                                                                        // the object cannot be changed but value can be changed
      //people rahul = new people(15,"rahul rana");
      people rahul = kunal;
      kunal.othername(rahul);

      System.out.println(rahul.population); //static var are accessed using class.var_name
      System.out.println(kunal.name);
      System.out.println(rahul.name);
  }
}
class people{
    int rollno;
    String name;
    static int population = 0;


    people(int rollno, String name){
        this.rollno = rollno;//you cannot do rollno = rollno hence this is used. 'this' is equivalent of self in python
        this.name = name;    //'this 'is good programming habit
        System.out.println(name + " : is created");
        population+=1;
    }
    void othername(people other){
        this.name = other.name;
        this.rollno = other.rollno;
    }
}
