package patterns;
import java.lang.Math;

public class diamond {
    public static void main(String args[]){
        int n = 5;
        int colend;
     for(int i =0;i<n*2-1;i++){
         if(i<n){colend=i;}
         else{colend=(((n*2)-2)-i);}
         for(int j=0;j<java.lang.Math.abs(n-1-colend);j++){
             System.out.print(" ");
         }
         for(int j=0;j<=colend;j++){
             System.out.print("* ");
         }
         System.out.println();
     }
    }
}
