package binarySearch;
import java.util.Scanner;

public class sqrtx {
//    public int mySqrt(int x){
//        if(x<0){
//            return -1;
//        }
//        if(x==0){
//            return 0;
//        }
//        if(x<4){
//            return 1;
//        }
//        int start = 1;
//        int end= x;
//        while(start<= end){
//            int middle= start + ((end-start)/2);
//            if(x == middle* middle){
//                return middle;
//            }
//            if(x < middle*middle){
//                end = middle -1;
//
//            }
//            if(x>middle*middle){
//                start = middle +1;
//            }
//        }
//        return end;
//    }
public static void main(String[] args) {
    int x;
    do{
    Scanner sc = new Scanner(System.in);
     x = sc.nextInt();
    System.out.println(Math.sqrt(x));
    }
    while(x!=0);


}
}
