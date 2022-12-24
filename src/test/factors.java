package test;

public class factors {
    public static void main(String args[]){
        int n =100;
        int factors = 0;
        for(int i = 1;i<= n/2;i++ ){
            if(n%i==0){
                factors++;
            }
        }
        System.out.println(factors);
    }
}
