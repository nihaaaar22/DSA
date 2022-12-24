package array;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(67);
        list.add(567);
        list.add(637);
        list.add(672);
        list.add(667);
        System.out.println(list);
        list.remove(3);
        list.set(3,56);
        System.out.println(list.contains(667));
        System.out.println(list.get(5));
    }
}
