package recursion;

public class febonacci {
    public static void main(String[] args) {
        //System.out.println((febo(6)));
        for (int i =0;i<7;i++){
            System.out.println(febo(i));
        }
    }
    static int febo(int n){
        if(n<2){return n;}
        return febo(n-1) + febo(n-2);
    }
}
