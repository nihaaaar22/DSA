package randomExperiment;
import java.util.*;

   public class guessGame {
    public static void main(String[] args) {
int ans;
        int target = 30;
          Scanner sc = new Scanner(System.in);
        do{
            System.out.println("guess a number between 1 - 100");
            ans = sc.nextInt();
            if(ans < target){
                System.out.println("ans is more than your guess");

            }

            if(ans>target){
                System.out.println( "ans is less than your guess");
            }
            if(ans==target){
                System.out.println("Congrats. You guessed it right the answer was" + target);
            }
        }
        while(ans!=target);
        }
    }

