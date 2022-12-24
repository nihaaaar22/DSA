package recursion;

import java.util.ArrayList;

public class Subsequent {
    public static void main(String[] args) {
        subset("","1234 ");
        System.out.println(subsetInArry("","abc"));

    }
    static void subset(String ans,String next){
        if(next.isEmpty()){
            System.out.println(ans + " " );
            return;
        }
        subset(ans+ next.charAt(0),next.substring(1));
        subset(ans,next.substring(1));

    }

    //keep adding the new array in the previuos arraylist
    static ArrayList<String> subsetInArry(String ans,String next){
        ArrayList list = new ArrayList();
        if(next.isEmpty()){
            list.add(ans);
            return list;
        }
        list.addAll(subsetInArry(ans+ next.charAt(0),next.substring(1)));
        list.addAll(subsetInArry(ans,next.substring(1)));
        return list;

    }
}
