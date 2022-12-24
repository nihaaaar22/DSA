package recursion;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skip("narappleas."));
        System.out.println("nafsd".startsWith("n"));

    }
    static String skip(String up){
        if(up.charAt(0)=='.'){return null;}
        if(up.startsWith("apple")){
            return up.substring(5);

        }
        return up.charAt(0)+skip(up.substring(1));
    }
}
