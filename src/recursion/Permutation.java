package recursion;

public class Permutation {
    public static void main(String[] args) {
        subset("a","bc");

    }
    static void subset(String ans,String next){
        if(next.isEmpty()){
            System.out.println(ans + " " );
            return;
        }

        subset(ans+ next.charAt(0),next.substring(1));
        subset(next.charAt(0)+ans,next.substring(1));

    }
}
